package cn.cherish.search.util;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 16:35
 */
@Data
@ApiModel
public class SearchResult {

    @ApiModelProperty("搜索词条")
    private String queryContext;

    @ApiModelProperty("结果总数")
    private long total;

    @ApiModelProperty("当前页码")
    private int current;

    @ApiModelProperty("搜索结果")
    private List<Item> items;

    @Data
    public static class Item {

        @ApiModelProperty("来源搜索引擎")
        private String engine;

        @ApiModelProperty("标题")
        private String title;
        @ApiModelProperty("HTML标题")
        private String htmlTitle;

        @ApiModelProperty("链接")
        private String link;

        @ApiModelProperty("片段描述")
        private String snippet;
        @ApiModelProperty("HTML片段描述")
        private String htmlSnippet;

        @ApiModelProperty("格式化URL")
        private String formattedUrl;
        @ApiModelProperty("HTML格式化URL")
        private String htmlFormattedUrl;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            Item item = (Item) o;

            return StringUtils.equals(link, item.link);
        }

        @Override
        public int hashCode() {
            int result = super.hashCode();

            if (link != null) {
                result = 31 * result + link.hashCode();
            }
            return result;
        }
    }
}
