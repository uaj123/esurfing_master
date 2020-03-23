package cn.uaj.proxy;

/**
 * @author wushaojie
 * @date 2020/1/17 10:17
 */
public class Produce implements IProduce{
    public void saleProduce(float money){
        System.out.println("出售产品，并收到钱"+money );
    }
    public void afterService(float money){
        System.out.println("售后服务，并收到钱" + money);
    }
}
