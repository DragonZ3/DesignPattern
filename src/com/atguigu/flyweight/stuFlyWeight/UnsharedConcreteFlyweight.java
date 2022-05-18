package com.atguigu.flyweight.stuFlyWeight;

//非享元角色(就是不能共享的代码)

public class UnsharedConcreteFlyweight{
    private String info;
    UnsharedConcreteFlyweight(String info) {
        this.info = info;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }
}
