package com.atguigu.factory.AbstractFactory.factory;

import com.atguigu.factory.AbstractFactory.port.Provider;
import com.atguigu.factory.AbstractFactory.port.Sender;
import com.atguigu.factory.AbstractFactory.impl.SmsSender;

public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
