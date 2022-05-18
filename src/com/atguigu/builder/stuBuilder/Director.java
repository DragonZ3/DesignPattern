package com.atguigu.builder.stuBuilder;
//指挥者：指挥建造者去完成产品的创建
public class Director {
    private Builder builder;

    //方便测试的使用，没有其他用途
    public Director(Builder builder){
        this.builder=builder;
    }

    //准备完成产品的创建
    public Product creatProduct(){
        builder.buildA();
        builder.buildB();
        builder.buildC();
        return builder.getProduct();
    }
}
