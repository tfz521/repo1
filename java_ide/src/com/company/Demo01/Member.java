package com.company.Demo01;

import java.util.ArrayList;
import java.util.Random;

/*
3.定义成员类
 */
public class Member extends User{
    public Member() {
    }

    public Member(String username, double leftmoney) {
        super(username, leftmoney);
    }
    // 打开红包,就是从集合中,随机取出一份,保存到自己的余额中
    public void openHongbao(ArrayList<Double> list){
        //创建Random对象
        Random r = new Random();
        //随机生成一个角标
        int index = r.nextInt(list.size());
        //移除一个金额
        Double delta = list.remove(index);
        //当前成员本来有多少钱
        Double money = super.getLeftmoney();
        //直接调用父类方法，设置到余额
        super.setLeftmoney(money+delta);

    }
}
