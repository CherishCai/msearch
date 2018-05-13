
package cn.cherish.search.web;

import cn.cherish.search.util.SearchResult;
import cn.cherish.search.util.SearchUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 14:46
 */
@RestController
@RequestMapping("/search")
@CrossOrigin("*")
public class SearchController {


    @GetMapping
    public ApiResult<SearchResult> search(
            @RequestParam(required = false, defaultValue = "") String kk,
            @RequestParam(required = false, defaultValue = "1") int page
            ) {
        SearchResult searchResult = SearchUtils.search(kk, page, 10);

        return new ApiResult<>(searchResult);
    }

}
