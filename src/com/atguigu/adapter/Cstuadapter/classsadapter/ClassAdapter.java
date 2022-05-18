package com.atguigu.adapter.Cstuadapter.classsadapter;
//类适配器类
//(它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。)

/**
 * 目的: 把已存在的接口转为新的接口
 */
public class ClassAdapter extends Adaptee implements Target{
    @Override
    public void request() {//request()是接口Target里面的方法
        specificRequest();//此方法是类Adaptee中的方法
    }
}
