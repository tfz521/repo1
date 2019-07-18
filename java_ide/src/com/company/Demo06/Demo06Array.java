package com.company.Demo06;

public class Demo06Array {
    public static void main(String[] args) {
        //创建一个数组-动态初始化
        int[] arrayA = new int[300];
        double[] arrayB = new double[10];
        String[] arrayC = new String[5];
        //静态初始化
        int[] arrayD = new int[]{5,15,25};
        String[] arrayE = new String[]{"Hello","World","Java"};
        //静态初始化 省略格式
        int[] arrayF = {10,20,30};
        //静态初始化可以拆分为两个步骤
        int[] arrayG;
        arrayG = new int[]{11,12,13};
        //动态初始化也可以拆分为两个步骤
        int[] arrayH;
        arrayH = new int[5];

    }

}
