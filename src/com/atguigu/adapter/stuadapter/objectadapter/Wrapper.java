package com.atguigu.adapter.stuadapter.objectadapter;

/**
 * 基本思路和类的适配器模式相同，
 * 只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
 */
public class Wrapper implements Targetable{
    private Source source;//这里是把Source类作为Wrapper类的属性(对象适配器)

    public Wrapper(Source source){
        super();
        this.source=source;
    }

    @Override
    public void method1() {
        source.method1();//这里就调用Source类中的方法
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}
