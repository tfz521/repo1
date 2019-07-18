package com.company.Demo01;
/*
发红包案例
1.定义用户类
 */
public class User {
    //成员变量
    private String username;   //用户名
    private double leftmoney;   //余额
    //构造方法
    //有参构造方法
    public User() {
    }
    //无参构造方法
    public User(String username, double leftmoney) {
        this.username = username;
        this.leftmoney = leftmoney;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getLeftmoney() {
        return leftmoney;
    }

    public void setLeftmoney(double leftmoney) {
        this.leftmoney = leftmoney;
    }
    //展示信息的方法
    public void show(){
        System.out.println("用户名："+username+",余额为:"+leftmoney+"元");
    }
}
