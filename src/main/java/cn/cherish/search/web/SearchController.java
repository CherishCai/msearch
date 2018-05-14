
package cn.cherish.search.web;

import cn.cherish.search.util.SearchResult;
import cn.cherish.search.util.SearchUtils;
import io.swagger.annotations.Api;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 14:46
 */
@Api("搜索相关接口")
@RestController
@RequestMapping("/search")
@CrossOrigin("*")
public class SearchController {

    @GetMapping
    public ApiResult<SearchResult> search(
            @RequestParam(required = false, defaultValue = "") String q,
            @RequestParam(required = false, defaultValue = "1") int page
            ) {
        if (StringUtils.isBlank(q)) {
            return new ApiResult<>(null);
        }
        SearchResult searchResult = SearchUtils.search(q, page, 10);

        return new ApiResult<>(searchResult);
    }

}
