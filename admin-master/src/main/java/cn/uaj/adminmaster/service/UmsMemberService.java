package cn.uaj.adminmaster.service;

import cn.uaj.adminmaster.common.CommonResult;

/**
 * 会员管理Service
 * @Author: wushaojie
 * @Date: 2020/4/16 11:06
 */
public interface UmsMemberService {
    /**
     * 生成验证码
     * @param telephone
     * @return
     */
    CommonResult generateAuthCode(String telephone);

    /**
     * 判断验证码和手机号是否匹配
     * @param telephone
     * @param authCode
     * @return
     */
    CommonResult verifyAuthCode(String telephone,String authCode);
}
