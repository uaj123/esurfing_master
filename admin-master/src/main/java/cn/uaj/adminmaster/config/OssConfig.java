package cn.uaj.adminmaster.config;

import com.aliyun.oss.OSSClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 用于配置oss的连接客户端ossClient
 * @Author: wushaojie
 * @Date: 2020/4/21 22:05
 */
@Configuration
public class OssConfig {
    @Value("${aliyun.oss.endpoint}")
    private String ALIYUN_OSS_ENDPOINT;
    @Value("${aliyun.oss.accessKeyId}")
    private String ALIYUN_OSS_ACCESSKEYID;
    @Value("${aliyun.oss.accessKeySecret}")
    private String ALIYUN_OSS_ACCESSKEYSECRET;
    @Bean
    public OSSClient ossClient(){
        return new OSSClient(ALIYUN_OSS_ENDPOINT,ALIYUN_OSS_ACCESSKEYID,ALIYUN_OSS_ACCESSKEYSECRET);
    }

}





