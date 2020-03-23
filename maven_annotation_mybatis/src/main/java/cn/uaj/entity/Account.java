package cn.uaj.entity;

import java.io.Serializable;

/**
 * @author wushaojie
 * @date 2020/1/14 11:30
 */
public class Account implements Serializable {
    private Integer id;
    private Integer uid;
    private String money;

    //多对一
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", uid=" + uid +
                ", money='" + money + '\'' +
                ", user=" + user +
                '}';
    }
}
