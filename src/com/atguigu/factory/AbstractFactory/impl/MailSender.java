package com.atguigu.factory.AbstractFactory.impl;

import com.atguigu.factory.AbstractFactory.port.Sender;

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }
}
