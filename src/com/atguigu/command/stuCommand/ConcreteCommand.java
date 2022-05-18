package com.atguigu.command.stuCommand;

//具体命令类
//是抽象命令类的具体实现类，它拥有接收者对象，并通过调用接收者的功能来完成命令要执行的操作。
public class ConcreteCommand implements Command {
    private Receiver receiver;

    ConcreteCommand() {
        receiver = new Receiver();
    }

    @Override
    public void execute() {
//        通过调用接收者的功能来完成命令要执行的操作。
        receiver.action();
    }
}
