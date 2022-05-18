package com.atguigu.factory.multifactory;

//里面有多个方法
//所以称为：多个工厂方法模式(最好写成静态的，方便调用)

public class SendFactory {//静态工厂方法模式
    public static Sender produceMail(){
        return new MailSender();
    }
    public static Sender produceSms(){
        return new SmsSender();
    }
}
