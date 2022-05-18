package com.atguigu.adapter.Cstuadapter.ObjectAdapter;
//对象适配器类
public class ObjectAdapter implements Target{
    private Adaptee adaptee;//这里就是一个对象

    public ObjectAdapter(Adaptee adaptee){
        this.adaptee=adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}
