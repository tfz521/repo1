package com.company.Demo11;

public class DemoMain {
    public static void main(String[] args) {
        //创建一个笔记本电脑
        Laptop laptop = new Laptop();
        laptop.run();
        //准备一个鼠标拱电脑使用
        //Mouse mouse = new Mouse();
        //首先进行向上转型 把鼠标当做USB
        USB usb = new Mouse();  //多态写法
        //参数是USB类型
        laptop.useUSB(usb);
        //创建一个USB键盘
        KeyBoard keyboard = new KeyBoard(); //没有使用多态写法
        laptop.useUSB(keyboard);  //正确写法，也发生了向上转型



        laptop.shutDown();

    }
}
