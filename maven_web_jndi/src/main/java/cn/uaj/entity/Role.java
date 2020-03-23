package cn.uaj.entity;

import java.io.Serializable;
import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/13 11:32
 */
public class Role implements Serializable {
    private Integer role_Id;
    private String role_Name;
    private String role_Desc;

    /*多对多的关系映射，一个角色可以具备多个用户，角色实体包含用户对象集合*/
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Integer getRole_Id() {
        return role_Id;
    }

    public void setRole_Id(Integer role_Id) {
        this.role_Id = role_Id;
    }

    public String getRole_Name() {
        return role_Name;
    }

    public void setRole_Name(String role_Name) {
        this.role_Name = role_Name;
    }

    public String getRole_Desc() {
        return role_Desc;
    }

    public void setRole_Desc(String role_Desc) {
        this.role_Desc = role_Desc;
    }

    @Override
    public String toString() {
        return "Role{" +
                "role_Id=" + role_Id +
                ", role_Name='" + role_Name + '\'' +
                ", role_Desc='" + role_Desc + '\'' +
                ", users=" + users +
                '}';
    }
}
