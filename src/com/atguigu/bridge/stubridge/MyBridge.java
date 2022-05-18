package com.atguigu.bridge.stubridge;

public class MyBridge extends Bridge{
    @Override
    public void method() {

        getSource().method();
    }
}
