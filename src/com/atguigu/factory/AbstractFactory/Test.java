package com.atguigu.factory.AbstractFactory;

import com.atguigu.factory.AbstractFactory.factory.SendMailFactory;
import com.atguigu.factory.AbstractFactory.factory.SendMessageFactory;
import com.atguigu.factory.AbstractFactory.port.Sender;

public class Test {
    public static void main(String[] args) {
        SendMailFactory sendMailFactory = new SendMailFactory();//实例化一个工厂
        Sender produce = sendMailFactory.produce();//调用实现Sender接口中的方法
        produce.Send();

        //新添加的功能，发送信息
        SendMessageFactory sendMessageFactory = new SendMessageFactory();
        Sender produce1 = sendMessageFactory.produce();
        produce1.Send();
    }
}
