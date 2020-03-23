package cn.uaj.service.impl;

import cn.uaj.service.IAccountService;
import org.springframework.stereotype.Service;


/**
 * @author wushaojie
 * @ 2020/1/27
 */
@Service("accountService")
public class AccountServiceImpl implements IAccountService {

    @Override
    public void saveAccount() {
        System.out.println("查询成功。。。。");
//         int i = 1 / 0;
    }
}
