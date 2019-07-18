package com.company.Demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(10,10));
    }
    /*
    三要素:
    返回值类型：boolean
    方法名称：isSame
    参数列表：int a,int b
     */
    public static boolean isSame(int a , int b){
        //boolean same;
        /*if (a == b){
            same = true;
        }else{
            same = false;
        }*/
        //boolean same = a == b ? true: false;
        //boolean same = a ==b;
        return a == b ;
    }
}

