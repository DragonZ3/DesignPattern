package com.atguigu.builder.stuBuilder;

public class Test {
    public static void main(String[] args) {
        Director director = new Director(new ConcreteBuilder());//这里的构造方法，方便测试用
        Product product = director.creatProduct();
        System.out.println(product.show());
    }
}
