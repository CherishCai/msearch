package cn.cherish.search.util;

import io.swagger.annotations.ApiModel;
import lombok.Data;

import java.util.List;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 16:35
 */
@Data
@ApiModel
public class SearchResult {

    private String queryContext;

    private long total;

    private int current;


    private List<Item> items;

    @Data
    public static class Item {
        private String title;
        private String htmlTitle;
        private String link;

        private String snippet;
        private String htmlSnippet;

        private String formattedUrl;
        private String htmlFormattedUrl;
    }
}
