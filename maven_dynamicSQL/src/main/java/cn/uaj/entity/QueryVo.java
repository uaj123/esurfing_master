package cn.uaj.entity;

import java.util.List;

/**
 * @author wushaojie
 * @date 2020/1/10 20:55
 */
public class QueryVo{
    private User user;
    public List<Integer> ids;
    public User getUser() {
        return user;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
