package com.company.Demo07;

public class Demo07PhoneParam {
    public static void main(String[] args) {
            Phone one = new Phone();
            one.price=8809.4;
            one.color="黑色";
            one.brand="苹果";
            method(one);
    }
    public static void method(Phone param){
        System.out.println(param.brand);
        System.out.println(param.color);
        System.out.println(param.price);
    }
}
