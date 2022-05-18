package com.atguigu.factory.builder;

public class Test {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.produceMailSender(5);
        System.out.println("======================");
        builder.produceSmsSender(5);
    }
}
