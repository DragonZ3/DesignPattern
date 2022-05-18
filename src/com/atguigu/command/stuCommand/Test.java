package com.atguigu.command.stuCommand;

public class Test {
    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConcreteCommand());
        System.out.println("客户访问调用者的call()方法：");
        invoker.call();
    }
}
