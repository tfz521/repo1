package com.company.Demo02;

class Employee {
    String name;

    public void work(){
        System.out.println("尽心尽力地工作");
    }
}

class Teacher extends Employee{
    public void printName(){
        System.out.println("name="+name);
    }
}

class Fu{
    private int n;
    //构造方法
    Fu(){
        System.out.println("Fu()");
    }
}

class Zi extends Fu{
    Zi(){
        //super()调用父类构造方法
        super();
        System.out.println("Zi()");
    }
}

