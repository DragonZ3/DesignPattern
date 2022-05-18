package com.atguigu.facade.stuFacade;

public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startUP();
        System.out.println("==============");
        computer.shutdown();
    }
}
