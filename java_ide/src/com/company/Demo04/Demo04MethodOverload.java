package com.company.Demo04;

public class Demo04MethodOverload {
    public static void main(String[] args) {
        System.out.println("两个数相加");
        System.out.println(sum(10,20));
        System.out.println("==========================");
        System.out.println("三个数相加");
        System.out.println(sum(10,20,30));
        System.out.println("==========================");
        System.out.println("四个数相加");
        System.out.println(sum(10,20,30,40));
        System.out.println("==========================");
    }
    public static int sum(int a , int b){
        return a+b;
    }
    public static int sum(int a , int b,int c){
        return a+b+c;
    }
    public static int sum(int a , int b,int c ,int d){
        return a+b+c+d;
    }
}
