package com.company.Demo11;

public class InterfaceDemo {
    public static void main(String[] args) {
        //创建子类对象
        Animal a = new Animal();
//        //调用实现后的方法
//        a.eat();
//        a.sleep();
        //调用默认方法
//        a.fly();
        LiveAble.run();//只能使用接口名调用

    }
}
