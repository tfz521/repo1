package com.company.Demo07;

public class Student {
    //成员变量
    private String name;
    private int age;

    public void setName(String str){
        name = str;
    }
    public String getName(){
        return name;
    }
    public void setAge(int num){
        age = num;
    }
    public int getAge(){
        return age;
    }
    //成员方法
    public void eat(){
        System.out.println("吃饭");
    }
    public void sleep(){
        System.out.println("睡觉");
    }
    public void study(){
        System.out.println("学习");
    }
}
