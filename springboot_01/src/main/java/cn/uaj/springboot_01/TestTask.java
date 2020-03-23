package cn.uaj.springboot_01;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时任务
 * @Author: wushaojie
 * @Date: 2020/3/19 15:21
 */
@Component
public class TestTask {

    // 秒 分 时 日 月 周 年
    @Scheduled(cron = "0 * 15 19 3 ?")
    public void dingshirenwu(){
        System.out.println("任务开始");
    }
}
