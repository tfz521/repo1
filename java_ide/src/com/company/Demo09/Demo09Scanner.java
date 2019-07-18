package com.company.Demo09;
import java.util.Scanner;//1.导包

public class Demo09Scanner {
    public static void main(String[] args) {
        //2.创建
        //备注；System.in代表从键盘进行输入
        Scanner sc = new Scanner(System.in);
        //3.获取键盘输入的int数字
        int num = sc.nextInt();
        System.out.println("输入的键盘数字为："+num);
        //4.获取键盘输入的字符串
        String str = sc.next();
        System.out.println("输入的键盘字符串为："+str);
    }
}
