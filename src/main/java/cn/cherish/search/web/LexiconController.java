
package cn.cherish.search.web;

import com.alibaba.fastjson.JSON;
import com.google.gson.reflect.TypeToken;
import io.swagger.annotations.Api;
import org.springframework.core.io.ClassPathResource;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 14:46
 */
@Api("词汇相关接口")
@RestController
@RequestMapping("/lexicons")
@CrossOrigin("*")
public class LexiconController {

    private static Map<String, List<String>> cache;
    static {
        ClassPathResource resource = new ClassPathResource("lexicon.json");
        try {
            InputStream in = resource.getInputStream();
            TypeToken<Map<String, List<String>>> typeToken = new TypeToken<Map<String, List<String>>>() {};

            cache = JSON.parseObject(in, typeToken.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping
    public ApiResult<Map<String, List<String>>> all() {
        return new ApiResult<>(cache);
    }

    @GetMapping("/with")
    public ApiResult<List<String>> with(@RequestParam String with) {
        return new ApiResult<>(cache.get(with));
    }

}
