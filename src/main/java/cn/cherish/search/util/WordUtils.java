package cn.cherish.search.util;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.*;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.RAMDirectory;
import org.apache.lucene.util.Version;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Cherish
 * @version 1.0
 * @date 2018/5/14 10:56
 */
public class WordUtils {
    private WordUtils(){}

    /**
     * 相关性排序
     * @throws Exception
     */
    public static List<SearchResult.Item> correlationOrdering(List<SearchResult.Item> source, String keyword) throws Exception {

        Analyzer analyzer = new IKAnalyzer();

        Directory directory = new RAMDirectory();
        // To store an index on disk, use this instead:
        //Directory directory = FSDirectory.open("/tmp/testindex");
        IndexWriter iwriter = new IndexWriter(directory, analyzer, true,
                new IndexWriter.MaxFieldLength(100));

        for (SearchResult.Item item : source) {
            iwriter.addDocument(buildDocument(item));
        }
        iwriter.close();

        IndexSearcher isearcher = new IndexSearcher(directory, true); // read-only=true

        QueryParser parser = new MultiFieldQueryParser(Version.LUCENE_30,
                new String[]{"title", "content"}, analyzer, null);

        Query query = parser.parse(keyword);

        Sort sort1 = new Sort(
                //如果两个都没有注释，那么就是按照先按照相关度，然后按照link排序（相关度相同的情况下）
                SortField.FIELD_SCORE,//注释掉这个就是按照link排序
                new SortField("link", SortField.STRING, false)//注释掉这个就是按照相关度排序
        );


        List<SearchResult.Item> results = new ArrayList<>(source.size());
        Map<String, SearchResult.Item> map = source.stream()
                .collect(Collectors.toMap(SearchResult.Item::getLink, v -> v));

        ScoreDoc[] hits = isearcher.search(query, null, 1000, sort1).scoreDocs;
        // Iterate through the results:

        for (ScoreDoc match : hits) {
            Document doc = isearcher.doc(match.doc);
            String link = doc.get("link");
            SearchResult.Item item = map.get(link);
            if (null != item) {
                results.add(item);
                map.remove(link);
            }
        }
        results.addAll(map.values());

        isearcher.close();
        directory.close();

        return results;
    }

    private static Document buildDocument(SearchResult.Item item) {
        Document doc = new Document();
        doc.add(new Field("link", String.valueOf(item.getLink()), Field.Store.YES, Field.Index.NOT_ANALYZED));
        doc.add(new Field("title", String.valueOf(item.getTitle()), Field.Store.YES,Field.Index.ANALYZED ));
        doc.add(new Field("snippet", String.valueOf(item.getSnippet()), Field.Store.YES,Field.Index.ANALYZED ));
        return doc;
    }

}
