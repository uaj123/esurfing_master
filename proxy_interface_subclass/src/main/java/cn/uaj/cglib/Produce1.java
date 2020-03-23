package cn.uaj.cglib;

/**
 * @author wushaojie
 * @date 2020/1/17 10:17
 */
public class Produce1{
    public void saleProduce(float money){
        System.out.println("出售产品，并收到钱"+money );
    }
    public void afterService(float money){
        System.out.println("售后服务，并收到钱" + money);
    }
}
