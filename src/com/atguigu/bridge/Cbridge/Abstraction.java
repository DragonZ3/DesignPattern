package com.atguigu.bridge.Cbridge;

//抽象化角色

/**
 * ：定义抽象类，并包含一个对实现化对象的引用
 */
abstract class Abstraction {
    protected  Implementor imple;

    protected  Abstraction(Implementor imple){
        this.imple=imple;
    }

    public abstract void Operation();
}
