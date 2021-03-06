package com.atguigu.builder.stuApplyBuilder;
//抽象建造者：装修工人
abstract  class Decorator {
    //创建产品对象
    protected Parlour product =new Parlour();

    public abstract void buildWall();
    public abstract void buildTV();
    public abstract void buildSofa();
    public abstract void buildFloor();

    //返回产品对象
    public Parlour getResult() {
        return product;
    }
}
