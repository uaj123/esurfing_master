package cn.uaj.lucene;

import org.apache.lucene.document.Document;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.queryparser.classic.ParseException;
import org.apache.lucene.queryparser.classic.QueryParser;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;
import java.io.IOException;

/**
 * 使用queryparser查询
 * 通过QueryParser也可以创建Query，QueryParser提供一个Parse方法，此方法可以直接根据查询语法来查询。Query对象执行的查询语法可通过System.out.println(query);查询。
 * 需要使用到分析器。建议创建索引时使用的分析器和查询索引时使用的分析器要一致。
 * 需要加入queryParser依赖的jar包。
 * @Author: wushaojie
 * @Date: 2020/2/23 17:16
 */
public class QueryParse {

    /**
     * 先将传入的参数进行分词后查询
     * @throws ParseException
     * @throws IOException
     */
    @Test
    public void queryParser() throws ParseException, IOException {
        // 1,创建一个Director对象，指定索引库的位置
        FSDirectory fsDirectory1 = FSDirectory.open(new File("D:\\temp\\index").toPath());
        //2，创建一个IndexReader对象
        DirectoryReader indexReader = DirectoryReader.open(fsDirectory1);
        // 3创建一个IndexSearcher对象，构造方法中的参数indexReader对象
        // 创建一个QueryPaser对象，两个参数
        QueryParser queryParser = new QueryParser("name", new IKAnalyzer());
        // 参数1，默认搜索域，参数2：分析器对象
        // 使用QueryParser对象创建一个Query对象
        Query query = queryParser.parse("lucene是一个java开发的全文检索工具包");
        // 5，执行查询，得到一个TomDocs对象
        IndexSearcher indexSearcher = new IndexSearcher(indexReader);
        TopDocs topDocs = indexSearcher.search(query, 11);
        // 6，取查询结果的总记录数
        System.out.println("查询总记录数" + topDocs.totalHits);
        // 7，取文档列表
        ScoreDoc[] scoreDocs = topDocs.scoreDocs;
        // 8，打印文档中的内容
        for (ScoreDoc scoreDoc : scoreDocs) {
            // 取文档id
            int docId = scoreDoc.doc;
            // 根据id取文档对象
            Document document = indexSearcher.doc(docId);
            System.out.println(document.get("name"));
            System.out.println(document.get("path"));
            System.out.println(document.get("size"));
            System.out.println(document.get("content"));
            System.out.println("-----------");
        }

        // 9.关闭IndexReader对象
        indexReader.close();
    }

}
