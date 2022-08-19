package com.rachel.springframework.bean;

public class UserService {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserService(String name){
        this.name = name;
    }

    public void queryUserInfo() {
        System.out.println("查询用户信息..");
    }
}
