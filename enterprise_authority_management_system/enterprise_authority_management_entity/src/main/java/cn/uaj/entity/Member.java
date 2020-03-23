package cn.uaj.entity;

import java.io.Serializable;

/**
 * @Author: wushaojie
 * @Date: 2020/2/14 21:09
 */
public class Member implements Serializable {
    private Integer id;
    private String name; // 姓名
    private String nickName; // 昵称
    private String phoneNum; // 电话号码
    private String email; // 邮箱

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
