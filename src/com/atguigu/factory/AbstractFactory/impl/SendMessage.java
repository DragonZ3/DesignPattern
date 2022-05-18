package com.atguigu.factory.AbstractFactory.impl;

import com.atguigu.factory.AbstractFactory.port.Sender;

public class SendMessage implements Sender {
    @Override
    public void Send() {
        System.out.println("新添加的功能，我要发送信息啦");
    }
}
