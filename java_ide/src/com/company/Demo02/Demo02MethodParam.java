package com.company.Demo02;

public class Demo02MethodParam {
    public static void main(String[] args) {
        method1(2,3);
        System.out.println("==================");
        method2();
    }
    //有参数
        public static void method1(int a, int b){
            int result = a * b;
            System.out.println("结果是："+result);
        }
    //无参数
        public static void method2(){
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello,World!!!"+i);
            }
        }
}
