package com.company.Demo07;

public class Demo07PhoneOne {
    public static void main(String[] args) {
        //创建对象
        Phone phone = new Phone();
        System.out.println(phone.brand);
        System.out.println("=======================");
        phone.brand = "三星";
        phone.color = "黑色";
        phone.price = 3300.0;
        //使用成员变量
        System.out.println("手机品牌是"+phone.brand);
        System.out.println("手机颜色是"+phone.color);
        System.out.println("手机价格是"+phone.price);
        System.out.println("=======================");
//        //使用成员方法
        phone.call("田馥甄");
        phone.sendMessage();
    }
}
