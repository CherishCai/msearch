package cn.cherish.search.util;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 17:06
 */
public class SearchUtils {
    public static SearchResult search(String searchItem, int page, int count) {
        SearchResult searchResult = new SearchResult();
        List<SearchResult.Item> items = new ArrayList<>();
        long total = 0L;

        // 处理Google搜索结果
        GoogleResult googleResult = GoogleWebSearchUtils.search(searchItem, page, count);
        if (googleResult != null) {
            try {
                String totalResults = googleResult.getSearchInformation().getTotalResults();
                total += Long.valueOf(totalResults);
            } catch (Exception ignore) {}

            List<SearchResult.Item> collect = googleResult.getItems().stream().map(v -> {
                SearchResult.Item item = new SearchResult.Item();

                BeanUtils.copyProperties(v, item);
                return item;
            }).collect(Collectors.toList());

            items.addAll(collect);
        }

        // 处理必应搜索结果
        BingResult bingResult = BingWebSearchUtils.search(searchItem, page, count);
        if (bingResult != null) {
            BingResult.WebPages webPages = bingResult.getWebPages();
            try {
                total += webPages.getTotalEstimatedMatches();
            } catch (Exception ignore) {}

            List<SearchResult.Item> collect = webPages.getValue().stream().map(v -> {
                SearchResult.Item item = new SearchResult.Item();
                item.setTitle(v.getName());
                item.setHtmlTitle(v.getName());

                item.setLink(v.getUrl());
                item.setFormattedUrl(v.getUrl());
                item.setHtmlFormattedUrl(v.getUrl());

                item.setSnippet(v.getSnippet());
                item.setHtmlSnippet(v.getSnippet());

                return item;
            }).collect(Collectors.toList());

            items.addAll(collect);
        }

        // 总体结果
        searchResult.setQueryContext(searchItem);
        searchResult.setTotal(total);
        searchResult.setCurrent(page);
        searchResult.setItems(Lists.newArrayList(Sets.newHashSet(items)));

        return searchResult;
    }
}
