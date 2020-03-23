package cn.au;

/**
 * @Author: wushaojie
 * @Date: 2020/3/23 20:25
 */
public class Strudent {
    private String stname;
    private Integer agea;

    public static Strudent getStudent(){
        return new Strudent("dad",4);
    }

    private Strudent(String stname, Integer agea) {
        this.stname = stname;
        this.agea = agea;
    }


    public String getStname() {
        return stname;
    }

    public void setStname(String stname) {
        this.stname = stname;
    }

    public Integer getAgea() {
        return agea;
    }

    public void setAgea(Integer agea) {
        this.agea = agea;
    }
}
