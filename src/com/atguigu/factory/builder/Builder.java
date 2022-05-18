package com.atguigu.factory.builder;

import com.atguigu.factory.AbstractFactory.port.Sender;
import com.atguigu.factory.AbstractFactory.impl.*;
import java.util.ArrayList;
import java.util.List;

public class Builder {
    private List<Sender> list = new ArrayList<Sender>();

    public void produceMailSender(int count) {
        for (int i = 0; i < count; i++) {
            MailSender sender = new MailSender();
            sender.Send();
            list.add(sender);
        }
    }

    public void produceSmsSender(int count) {
        for (int i = 0; i < count; i++) {
            SmsSender sender = new SmsSender();
            sender.Send();
            list.add(new SmsSender());
        }
    }
}