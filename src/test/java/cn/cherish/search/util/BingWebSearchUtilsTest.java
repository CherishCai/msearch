
package cn.cherish.search.util;

import org.junit.Test;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 15:25
 */
public class BingWebSearchUtilsTest {

    @Test
    public void search() throws Exception {
        BingResult bingResult = BingWebSearchUtils.search("西安", 1, 10);

        System.out.println("long = " + bingResult.getWebPages().getTotalEstimatedMatches());

    }


}