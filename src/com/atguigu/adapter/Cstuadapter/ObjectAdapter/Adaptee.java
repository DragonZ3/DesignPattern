package com.atguigu.adapter.Cstuadapter.ObjectAdapter;

//适配者接口(它是被访问和适配的现存组件库中的组件接口。)已存在的接口
class Adaptee {
    public void specificRequest() {
        System.out.println("适配者中的业务代码被调用！");
    }
}