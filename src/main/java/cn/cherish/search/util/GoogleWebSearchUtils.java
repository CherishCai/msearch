package cn.cherish.search.util;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

import java.net.URLEncoder;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 14:03
 */
@Slf4j
public class GoogleWebSearchUtils {

    private static final String KEY = "AIzaSyDCor3uGkrFUYIGkJOX0PlP653WHrQxuL4";
    private static final String CX = "012883174227260507803:7-irmnpcsci";

    private static final String SS = "https://www.googleapis.com/customsearch/v1" +
            "?q=%s&num=%s&start=%s&key=" + KEY + "&cx=" + CX + "&alt=json";


    public static GoogleResult search(String searchItem, int page, int count) {
        if (page < 1) {
            page = 1;
        }
        if (count < 0) {
            count = 10;
        }

        int startIndex = (page - 1) * count + 1;
        try {
            searchItem = URLEncoder.encode(searchItem, "UTF-8");
        } catch (Exception ignore) {
        }
        String url = String.format(SS, searchItem, count, startIndex);
        log.info("search url:{}", url);
        try {
            Request request = OkHttpClientUtils.getReq(url);

            Response response = OkHttpClientUtils.defaultClient().newCall(request).execute();
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

            return JSON.parseObject(bodyStr, GoogleResult.class);
        } catch (Exception e) {
            log.error("search error, url:{}", url, e);
        }
        return null;
    }


}
