package com.atguigu.adapter.stuadapter.classfaceadapter;

/**
 * 有一个Source类，拥有一个方法，待适配，目标接口时Targetable，
 * 通过Adapter类，将Source的功能扩展到Targetable里，看代码
 *
 * 这是类的适配器
 * 这样Targetable接口的实现类就具有了Source类的功能。
 */
public class TestAdapter {
    public static void main(String[] args) {
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}
