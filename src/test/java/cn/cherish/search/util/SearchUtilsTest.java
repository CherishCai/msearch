
package cn.cherish.search.util;

import org.junit.Test;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/14 11:28
 */
public class SearchUtilsTest {
    @Test
    public void search() throws Exception {
        SearchResult result = SearchUtils.search("蔡鸿文", 1, 10);
        System.out.println("result = " + result);
    }

}