package com.company.Demo03;

public class Demo02MethodSum {
    public static void main(String[] args) {
        System.out.println(getSum());
    }
    /*
    三要素:
    返回值类型：有返回值 int
    方法名称：
    参数列表：不需要参数
     */
    public static int getSum(){
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
