package cn.uaj.service.impl;

import cn.uaj.entity.Account;
import cn.uaj.service.IAccountService;

import java.util.*;

/**
 * @author wushaojie
 * @date 2020/1/15 15:38
 */
public class AccountServiceImpl1 implements IAccountService {

    private String name;
    private Integer age;
    private Date date;
    private String[] myStrs;
    private List<String> myList;
    private Set<String> mySet;
    private Map<String,String> myMap;
    private Properties myProps;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String[] getMyStrs() {
        return myStrs;
    }

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public List<String> getMyList() {
        return myList;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public Set<String> getMySet() {
        return mySet;
    }

    public void setMySet(Set<String> mySet) {
        this.mySet = mySet;
    }

    public Map<String, String> getMyMap() {
        return myMap;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public Properties getMyProps() {
        return myProps;
    }

    public void setMyProps(Properties myProps) {
        this.myProps = myProps;
    }

    @Override
    public List<Account> findAll() {
        System.out.println(name +"=="+ age +"=="+ date);
        System.out.println("myStrs ==" + Arrays.toString(myStrs));
        System.out.println("myList ==" + myList);
        System.out.println("myMap ==" + myMap);
        System.out.println("myProps ==" + myProps);
        System.out.println("mySet ==" + mySet);
        return null;
    }
}
