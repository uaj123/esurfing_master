package cn.uaj.adminmaster.service;

import cn.uaj.adminmaster.dto.OssCallbackResult;
import cn.uaj.adminmaster.dto.OssPolicyResult;

import javax.servlet.http.HttpServletRequest;

/**
 * oss上传管理Service
 * @Author: wushaojie
 * @Date: 2020/4/21 22:27
 */
public interface OssService {
    /**
     * oss上传车略生成
     * @return
     */
    OssPolicyResult policy();

    /**
     * oss上传成功回调
     * @param request
     * @return
     */
    OssCallbackResult callback(HttpServletRequest request);

}












