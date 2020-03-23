package cn.uaj.lucene;

import org.apache.commons.io.FileUtils;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.document.*;
import org.apache.lucene.index.DirectoryReader;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.search.*;
import org.apache.lucene.store.FSDirectory;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;
import java.io.IOException;

/**
 * 全文检索创建索引
 * @Author: wushaojie
 * @Date: 2020/2/22 20:09
 */
public class LuceneFist {
    /**
     * 创建索引库
     * @throws IOException
     */
    @Test
    public void createIndex() throws IOException {
        // 1,创建一个Director对象，指定索引库保存的位置
        FSDirectory fsDirectory = FSDirectory.open(new File("D:\\temp\\index").toPath());
        // 2,基于Directory对象创建一个IndexWriter对象
        IndexWriterConfig indexWriterConfig = new IndexWriterConfig(new IKAnalyzer());
        IndexWriter indexWriter = new IndexWriter(fsDirectory, indexWriterConfig);
        // 3, 读取磁盘上的文件，对应每个文件创建一个文档对象
        File dir = new File("D:\\lucene-7.7.2\\searchsource");
        File[] files = dir.listFiles();
        assert files != null;
        for (File f :files) {
            // 取文件名
            String fName = f.getName();
            // 取文件的路径
            String fPath = f.getPath();
            // 文件的内容
            String fileToString = FileUtils.readFileToString(f, "utf-8");
            // 文件的大小
            long fSize = FileUtils.sizeOf(f);
            // 创建Filed
            // 参数1：域的名称，参数2：域的内容，参数3：是否存储
            Field fieldName = new TextField("name", fName, Field.Store.YES);
            Field fieldPath = new StoredField("path", fPath);
            Field fieldContent = new TextField("content", fileToString, Field.Store.YES);
            Field fieldSizeValue = new LongPoint("size", fSize);
            StoredField storedSizeField = new StoredField("size", fSize);

            // 创建文档对象
            Document document = new Document();
            // 向文档对象中添加域
            document.add(fieldName);
            document.add(fieldPath);
            document.add(fieldContent);
            document.add(fieldSizeValue);
            document.add(storedSizeField);
            // 使用indexWriter对象将document对象写入索引库，此过程进行索引创建。
            // 并将索引和document对象写入索引库
            indexWriter.addDocument(document);
        }
        // 关闭IndexWriter
        indexWriter.close();

    }

    /**
     * TermQuery，通过项查询，TermQuery不使用分析器所以建议匹配不分词的Field域查询，比如订单号、分类ID号等。
     * 查询索引
     * @throws Exception
     */
    @Test
    public void searchIndex() throws Exception{
        // 1,创建一个Director对象，指定索引库的位置
        FSDirectory fsDirectory = FSDirectory.open(new File("D:\\temp\\index").toPath());
        //2，创建一个IndexReader对象
        DirectoryReader indexReader = DirectoryReader.open(fsDirectory);
        // 3创建一个IndexSearcher对象，构造方法中的参数indexReader对象
        IndexSearcher indexSearcher = new IndexSearcher(indexReader);
        // 4，创建一个Query查询条件，TermQuery
        TermQuery query1 = new TermQuery(new Term("name","spring"));
        // 5，执行查询，得到一个TomDocs对象
        TopDocs topDocs = indexSearcher.search(query1, 10);
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

    /**
     * 数值范围查询
     * @throws Exception
     */
    @Test
    public void RangeQuery() throws Exception{
        // 1,创建一个Director对象，指定索引库的位置
        FSDirectory fsDirectory1 = FSDirectory.open(new File("D:\\temp\\index").toPath());
        //2，创建一个IndexReader对象
        DirectoryReader indexReader = DirectoryReader.open(fsDirectory1);
        // 3创建一个IndexSearcher对象，构造方法中的参数indexReader对象
        IndexSearcher indexSearcher1 = new IndexSearcher(indexReader);
        // 4，创建一个Query查询条件，Query
        Query query = LongPoint.newRangeQuery("size",0l,100l);
        // 5，执行查询，得到一个TomDocs对象
        TopDocs topDocs1 = indexSearcher1.search(query, 12);
        // 6，取查询结果的总记录数
        System.out.println("查询总记录数:" + topDocs1.totalHits);
        // 7，取文档列表
        ScoreDoc[] scoreDocs = topDocs1.scoreDocs;
        // 8，打印文档中的内容
        for (ScoreDoc scoreDoc : scoreDocs) {
            // 取文档id
            int docId = scoreDoc.doc;
            // 根据id取文档对象
            Document document = indexSearcher1.doc(docId);
            System.out.println(document.get("name"));
            System.out.println(document.get("path"));
            System.out.println(document.get("size"));
            System.out.println(document.get("content"));
            System.out.println("-----------");
        }

        // 9.关闭IndexReader对象
        indexReader.close();
    }

    /**
     * 测试分析器分词效果
     * @throws IOException
     */
    @Test
    public void testTokenStream() throws IOException {
        // 1,创建一个标准分析器Analyzer对象
        // StandardAnalyzer standardAnalyzer = new StandardAnalyzer();
        // 中文分析器对象
        IKAnalyzer ikAnalyzer = new IKAnalyzer();
        // 2,使用分析器对象的tokenStream方法获得一个TokenStream对象
        TokenStream tokenStream = ikAnalyzer.tokenStream("", "等——《说文》：“等，齐简也，从竹寺，会意。”按：寺为简册杂积之地。《广雅·释诂》曰：“等，齐也。”原为实词中的动词。而等级则为名词。由于“等”本音，为都在反，又转音丁儿反，有何等或何物之义，唐代时的如今江浙地区人，都称“齐等”为丁儿反，应瑗诗有“用等称才学，往往见叹誉”之句，意谓用何才学，而被赞誉当官。（颜师古《匡谬正俗》卷\n" +
                "六）《后汉书·祢衡传》：“死公!云等道?”注：“等道犹今言何勿语也。”可见等有“何”义，可作虚词。（摘自黄现璠著《古书解读初探——黄现璠学术论文选》第450页，广西师范大学出版社,2004年7月第1版）\n" +
                "台阶\n" +
                "【等】称量轻重也。例句：1、[孟子]等百世之王。2、[史记夏本纪]等之未有贤于鲧者。又，《警世通言》第二十二卷《宋小官团圆破毡笠》句：“便取出银子，刚刚一块，讨等来一称，叫声惭愧。”可知又为“称量轻重的工具”，即秤或天平，或笼统称谓。居牖客查不出，就教于大方之家。～～\n" +
                "等韵学研究的对象，通常二名不分。它是以音节表为主要方式对汉语字音进行分析的一门学科，是汉语音韵学的一个分支。");
        // 3，向TokenStream对象中设置一个引用，
        CharTermAttribute charTermAttribute = tokenStream.addAttribute(CharTermAttribute.class);
        // 4,调用TokenStream对象的rest方法，如果不调用抛异常
        tokenStream.reset();
        // 5，遍历TokenStream对象
        while (tokenStream.incrementToken()) {
            System.out.println(charTermAttribute.toString());
        }
        // 6,关闭TokenStream对象
    }
}
