package cn.cherish.search.util;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.net.URLEncoder;

@Slf4j
public class BingWebSearchUtils {

    // Replace the subscriptionKey string value with your valid subscription key.
    static String subscriptionKey = "71a51a5e034346c6aba829e9b36186fa";

    // Verify the endpoint URI.  At this writing, only one endpoint is used for Bing
    // search APIs.  In the future, regional endpoints may be available.  If you
    // encounter unexpected authorization errors, double-check this value against
    // the endpoint for your Bing Web search instance in your Azure dashboard.
    static String host = "https://api.cognitive.microsoft.com";
    static final String SS = host + "/bing/v7.0/search?responseFilter=Webpages" +
            "&q=%s&count=%s&offset=%s";


    public static BingResult search(String searchItem, int page, int count) {
        if (page < 1) {
            page = 1;
        }
        if (count < 0) {
            count = 10;
        }

        int offset = (page - 1) * count;
        try {
            searchItem = URLEncoder.encode(searchItem, "UTF-8");
        } catch (Exception ignore) {
        }
        String url = String.format(SS, searchItem, count, offset);

        log.info("search url:{}", url);
        try {
            Request request = new Request.Builder()
                    .url(url)
                    .header("Ocp-Apim-Subscription-Key", subscriptionKey)
                    .get()
                    .build();

            OkHttpClient okHttpClient = OkHttpClientUtils.defaultClient();

            Response response = okHttpClient.newCall(request).execute();
            if (response == null) {
                log.warn("search response is null, url:{}", url);
                return null;
            }

            ResponseBody body = response.body();
            if (body == null) {
                log.warn("search responseBody is null, url:{}", url);
                return null;
            }
            String bodyStr = body.string();
            System.out.println(bodyStr);
            if (!response.isSuccessful()) {
                log.warn("search isSuccessful is false, url:{}, body:{}", url, body);
                return null;
            }
            return JSON.parseObject(bodyStr, BingResult.class);
        } catch (Exception e) {
            log.error("search error, url:{}", url, e);
        }
        return null;
    }


}