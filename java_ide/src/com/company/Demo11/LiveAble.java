package com.company.Demo11;
/*
定义接口
非抽象子类实现接口：
1. 必须重写接口中所有抽象方法。
2. 继承了接口的默认方法，即可以直接调用，也可以重写
 */
public interface LiveAble {
//    //定义抽象方法
//    public abstract void eat();
//    public abstract void sleep();
    //定义默认方法
    public default void fly(){
        System.out.println("天上飞");
    }
    //定义静态方法
    public static void run(){
        System.out.println("跑起来~~~~·");
    }

}
