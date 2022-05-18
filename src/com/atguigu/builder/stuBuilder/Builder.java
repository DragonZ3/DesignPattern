package com.atguigu.builder.stuBuilder;
//抽象建造者
public abstract class Builder {
    //产品对象,供子类去调用
    public Product product=new Product();

    //创建三个抽象方法，让子类去实现
    public abstract void buildA();
    public abstract void buildB();
    public abstract void buildC();

    //用户返回产品对象
    public Product getProduct(){
        return product;
    }
}
