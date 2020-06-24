package cn.uaj.entity;

import java.io.Serializable;

/**
 * @author wushaojie
 * @ 2020/1/27
 */
public class Account implements Serializable {
    private Integer id;
    private String name;
    private Float money;

    public Account(String name, Float money) {
        this.name = name;
        this.money = money;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
