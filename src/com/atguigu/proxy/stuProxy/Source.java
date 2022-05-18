package com.atguigu.proxy.stuProxy;

public class Source implements Sourceable{
    @Override
    public void method() {
        System.out.println("the Source method!");
    }
}
