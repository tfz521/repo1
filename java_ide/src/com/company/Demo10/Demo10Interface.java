package com.company.Demo10;
/*
接口使用步骤：
1.接口不能直接使用，必须有一个“实现类”来“实现”该接口
格式：
public class 实现类名称 implements 接口名称{
    //...
}
2.接口的实现类必须覆盖重写（实现）接口中所有的抽象方法
实现：去掉abstract 关键字，加上大括号
3.创建实现类的对象，进行使用
 */
public class Demo10Interface {
    public static void main(String[] args) {
        //创建实现类的对象使用
        MyInterfaceAbstractImpl impl = new MyInterfaceAbstractImpl();
            impl.methodAbs1();
            impl.methodAbs2();
    }
}
