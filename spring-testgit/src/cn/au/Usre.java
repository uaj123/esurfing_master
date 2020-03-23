package cn.au;

/**
 * @Author: wushaojie
 * @Date: 2020/3/23 18:23
 */
public class Usre {
    public String name;
    public Integer age;

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

    public Usre(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "cn.au.Usre{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
