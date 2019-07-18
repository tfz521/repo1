package com.company.Demo02;

public class Demo04MethodReturn {
    public static void main(String[] args) {
        int num = getSum(10,20);
        System.out.println("返回的结果是："+num);
        System.out.println("============================");
        printSum(100,200);
        System.out.println("============================");
        System.out.println(getSum(10,20));
        getSum(3,5);
    }
        public static int getSum(int a,int b){
            int result = a + b;
            return result;
        }
        public static void printSum(int a, int b){
            int result = a+b;
            System.out.println("结果是"+result);
        }
}
