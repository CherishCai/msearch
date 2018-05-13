
package cn.cherish.search.web;

import cn.cherish.search.util.GoogleResult;
import cn.cherish.search.util.GoogleWebSearchUtils;
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
    public ApiResult<GoogleResult> search(
            @RequestParam(required = false, defaultValue = "") String kk,
            @RequestParam(required = false, defaultValue = "1") int page,
            @RequestParam(required = false, defaultValue = "20") int pageSize
            ) {
        GoogleResult googleResult = GoogleWebSearchUtils.search(kk, page, pageSize);

        return new ApiResult<>(googleResult);
    }

}
