package com.atguigu.builder.stuApplyBuilder;
////具体建造者：具体装修工人2
public class ConcreteDecorator2 extends Decorator {
    public void buildWall() {
        product.setWall("w2");
    }

    public void buildTV() {
        product.setTV("TV2");
    }

    public void buildSofa() {
        product.setSofa("sf2");
    }

    @Override
    public void buildFloor() {
        product.setFloor("fl2");
    }
}
