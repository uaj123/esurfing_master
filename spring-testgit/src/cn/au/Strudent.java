package cn.au;

/**
 * @Author: wushaojie
 * @Date: 2020/3/23 20:16
 */
public class Strudent {
    private String sname;
    private Integer sage;

    public static Strudent getStudent(){
        return new Strudent("小生成",2);
    }

    public String getSname() {
        return sname;
    }

    private Strudent(String sname, Integer sage) {
        this.sname = sname;
        this.sage = sage;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public Integer getSage() {
        return sage;
    }

    public void setSage(Integer sage) {
        this.sage = sage;
    }
}
