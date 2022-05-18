package com.atguigu.decorator.studecorator;

public class DecoratorTest {
    public static void main(String[] args) {
        Sourceable source = new Source();
        source.method();//这里直接调用Source类中的方法也可以打印出来，因为改类实现了Sourceable接口
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}
