package cn.cherish.search.util;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 14:03
 */
@Slf4j
public class GoogleWebSearchUtils {

    public static final String KEY = "AIzaSyDCor3uGkrFUYIGkJOX0PlP653WHrQxuL4";
    public static final String CX = "012883174227260507803:7-irmnpcsci";

    public static final String SS = "https://www.googleapis.com/customsearch/v1" +
            "?q=%s&num=%s&start=%s&key=" + KEY + "&cx=" + CX + "&alt=json";


    public static GoogleResult search(String searchItem, int page, int count) {
        if (page < 1) {
            page = 1;
        }
        if (count < 0) {
            count = 10;
        }

        int startIndex = (page - 1) * count + 1;

        String url = String.format(SS, searchItem, count, startIndex);
        log.info("search url:{}", url);
        try {
            Request request = OkHttpClientUtils.getReq(url);
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
            return JSON.parseObject(body.string(), GoogleResult.class);
        } catch (Exception e) {
            log.error("search error, url:{}", url, e);
        }
        return null;
    }

    public static void main(String[] args) {
        search("GG", 1, 10);
    }


}
