package cn.uaj.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/10 17:19
 */
public class User implements Serializable {
    private Integer id;
    private String username;
    private String address;
    private Date birthday;
    private String sex;

    /*一对多的多表查询，主表实体中包含从表的对象引用*/
    private List<Account> accounts;

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", sex='" + sex + '\'' +
                ", accounts=" + accounts +
                '}';
    }
}
