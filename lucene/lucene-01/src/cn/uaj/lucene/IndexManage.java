package cn.uaj.lucene;

import org.apache.lucene.document.Document;
import org.apache.lucene.document.Field;
import org.apache.lucene.document.StoredField;
import org.apache.lucene.document.TextField;
import org.apache.lucene.index.IndexWriter;
import org.apache.lucene.index.IndexWriterConfig;
import org.apache.lucene.index.Term;
import org.apache.lucene.store.FSDirectory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.wltea.analyzer.lucene.IKAnalyzer;

import java.io.File;

/**
 * 索引库维护
 * @Author: wushaojie
 * @Date: 2020/2/23 16:29
 */
public class IndexManage{


    private IndexWriter indexWriter;


    @Before
    public void init() throws Exception{
        // 创建一个IndexWriter对象，使用IKAnalyzer作为分析器
        indexWriter = new IndexWriter(FSDirectory.open(new File("D:\\temp\\index").toPath()), new IndexWriterConfig(new IKAnalyzer()));

    }
    @After
    public void destroy() throws Exception{
        // 关闭索引库
        indexWriter.close();
    }
    /**
     * 添加索引
     * @throws Exception
     */
    @Test
    public void addDocument() throws Exception{
        // 创建Document对象
        Document document = new Document();
        // 向document对象中添加域
        document.add(new TextField("name","新添加的文件", Field.Store.YES));
        document.add(new TextField("content","新添加的文件内容", Field.Store.NO));
        document.add(new StoredField("path","D:/temp/hello"));
        // 把文档写入索引库
        indexWriter.addDocument(document);
    }

    @Test
    public void deleteAllDocument() throws Exception{
        // 删除全部文档
        indexWriter.deleteAll();
    }

    @Test
    public void deleteDocumentByQuery() throws Exception{
        // 根据指定查询条件删除文档
        indexWriter.deleteDocuments(new Term("name","spring"));
    }

    @Test
    public void updateDocument() throws Exception{
        // 创建一个新的文档对象
        Document document = new Document();
        // 向文档对象中添加域
        document.add(new TextField("name","跟新之后的文档",Field.Store.YES));
        document.add(new TextField("name1","跟新之后的文档1",Field.Store.YES));
        document.add(new TextField("name2","跟新之后的文档2",Field.Store.YES));
        // 执行跟新操作
        indexWriter.updateDocument(new Term("name","spring"),document);
    }
}
