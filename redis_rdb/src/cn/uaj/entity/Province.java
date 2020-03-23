package cn.uaj.entity;

import java.io.Serializable;

/**
 * @Author: wushaojie
 * @Date: 2020/2/11 20:30
 */
public class Province implements Serializable {
    private Integer id;
    private String province;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "Province{" +
                "id=" + id +
                ", province='" + province + '\'' +
                '}';
    }
}
