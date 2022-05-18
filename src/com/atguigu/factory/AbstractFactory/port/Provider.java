package com.atguigu.factory.AbstractFactory.port;


public interface Provider {
    //把Sender接口作为另一个接口的方法，让两个工厂类去实现改方法
    Sender produce();
}
