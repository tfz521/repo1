package com.company.Demo05;

public class Demo05OverloadPrint {
    public static void main(String[] args) {
        myPrint(100);
    }
    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(short num){
        System.out.println(num);
    }
    public static void myPrint(int is){
        System.out.println(is);
    }
}
