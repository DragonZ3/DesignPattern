package com.atguigu.builder.stuBuilder;
//具体建造者
public class ConcreteBuilder extends Builder {

    @Override
    public void buildA() {
        //使用父类中的属性去调用产品中的方法
        product.setA("我是产品中的A模块");
    }

    @Override
    public void buildB() {
        product.setB("我是产品中的B模块");
    }

    @Override
    public void buildC() {
        product.setC("我是产品中的C模块");
    }
}
