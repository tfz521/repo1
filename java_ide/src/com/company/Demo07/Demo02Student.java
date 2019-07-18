package com.company.Demo07;

public class Demo02Student {
    public static void main(String[] args) {
        //创建对象
        //根据Student类创建一个stu对象
        Student stu = new Student();
        stu.setName("邓紫棋");
        stu.setAge(27);

       //使用其中的成员变量
        System.out.println("年龄:"+stu.getAge());
        System.out.println("姓名:"+stu.getName());
        //使用其中的成员方法
        stu.eat();
        stu.sleep();
        stu.study();

    }

}
