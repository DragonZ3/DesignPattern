package com.atguigu.factory.AbstractFactory.factory;

import com.atguigu.factory.AbstractFactory.port.Provider;
import com.atguigu.factory.AbstractFactory.impl.SendMessage;
import com.atguigu.factory.AbstractFactory.port.Sender;

public class SendMessageFactory implements Provider {
    @Override
    public Sender produce() {
        return new SendMessage();
    }
}
