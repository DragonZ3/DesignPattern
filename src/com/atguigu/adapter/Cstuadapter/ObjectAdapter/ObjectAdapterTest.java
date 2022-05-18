package com.atguigu.adapter.Cstuadapter.ObjectAdapter;
//客户端代码

public class ObjectAdapterTest {
    public static void main(String[] args) {

        Target target = new ObjectAdapter(new Adaptee());//这里传入的是一个对象，因此称为一个对象适配器
        target.request();
    }
}
