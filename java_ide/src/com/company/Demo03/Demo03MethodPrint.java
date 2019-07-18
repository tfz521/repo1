package com.company.Demo03;

public class Demo03MethodPrint {
    public static void main(String[] args) {
    countPrint(10);
    }
    /*
    三要素：
    返回值类型：无返回值
    方法名称：countPrint
    参数列表：有参数
     */
    public static void countPrint(int n){
        for (int i = 1; i <= n; i++) {
            System.out.println("Hello World!"+"第"+i+"次打印");
        }
    }
}
