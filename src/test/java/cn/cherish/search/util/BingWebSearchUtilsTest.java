
package cn.cherish.search.util;

import org.junit.Test;

import static cn.cherish.search.util.BingWebSearchUtils.*;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/13 15:25
 */
public class BingWebSearchUtilsTest {

    @Test
    public void searchWeb() throws Exception {
        if (subscriptionKey.length() != 32) {
            System.out.println("Invalid Bing Search API subscription key!");
            System.out.println("Please paste yours into the source code.");
            System.exit(1);
        }

        try {
            System.out.println("Searching the Web for: " + searchTerm);

            SearchResults result = SearchWeb(searchTerm);

            System.out.println("\nRelevant HTTP Headers:\n");
            for (String header : result.relevantHeaders.keySet())
                System.out.println(header + ": " + result.relevantHeaders.get(header));

            System.out.println("\nJSON Response:\n");
            System.out.println(prettify(result.jsonResponse));
        }
        catch (Exception e) {
            e.printStackTrace(System.out);
            System.exit(1);
        }
    }

}