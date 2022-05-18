package com.atguigu.factory.multifactory;

public class FactoryTest {
    public static void main(String[] args) {
        //写成静态，方面调用
        Sender sender = SendFactory.produceMail();
        sender.send();

        Sender sender1 = SendFactory.produceSms();
        sender1.send();
    }
}
