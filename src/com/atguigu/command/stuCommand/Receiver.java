package com.atguigu.command.stuCommand;
//实现者/接收者（Receiver）角色：执行命令功能的相关操作，
//是具体命令对象业务的真正实现者。
public class Receiver {
    public void action(){
        System.out.println("具体命令的实现者:比如，我要开始换台了");
    }
}
