package com.company.Demo11;
/*
定义笔记本类
 */
public class Laptop {
    //笔记本开启
    public void run(){
        System.out.println("笔记本运行");
    }
    // 笔记本使用usb设备，这时当笔记本对象调用这个功能时，必须给其传递一个符合USB规则的USB设备
    //使用接口作为方法的参数
    public void useUSB(USB usb){
        //判断是否有usb设备
        usb.open();
        if (usb instanceof Mouse){
            Mouse mouse = (Mouse) usb ;//向下转型
            mouse.click();
        }else if (usb instanceof KeyBoard){
            KeyBoard keyboard = (KeyBoard) usb; //向下转型
            keyboard.type();

        }

        usb.close();
    }

        public void shutDown() {
        System.out.println("笔记本关闭");
    }
}
