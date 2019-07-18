package com.company.Demo01;

import java.util.ArrayList;
import java.util.Scanner;

/*
4.定义测试类
 */
public class Test {
    public static void main(String[] args) {

        //创建一个群主对象
        QunZhu qz = new QunZhu("群主",100);
        // 创建三个成员
        Member m = new Member("成员1",0);
        Member m2 = new Member("成员2",0);
        Member m3 = new Member("成员3",0);

        // 展示信息
        qz.show();
        m.show();
        m2.show();
        m3.show();
        System.out.println("=======================");


        //发送红包
        ArrayList<Double> sendList = qz.send(20,3);

        //判断 如果余额不足
        if (sendList==null){
            System.out.println("余额不足...");
            return;
        }
        // 打开红包
        m.openHongbao(sendList);
        m2.openHongbao(sendList);
        m3.openHongbao(sendList);

        // 展示信息
        qz.show();
        m.show();
        m2.show();
        m3.show();



    }
}
