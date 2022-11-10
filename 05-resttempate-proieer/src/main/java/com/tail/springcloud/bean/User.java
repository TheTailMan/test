package com.tail.springcloud.bean;

/**
 * 作者:admin
 * 时间:2022/11/9
 * 版本:
 * 功能:com.tail.springcloud.bean
 * Web后端springcloud
 */
public class User {
    private String name;
    private Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

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
}
