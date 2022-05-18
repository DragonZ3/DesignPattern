package com.atguigu.adapter.stuadapter.objectadapter;

/**
 * 有一个Source类，拥有一个方法，待适配，目标接口时Targetable，
 * 通过Adapter类，将Source的功能扩展到Targetable里，看代码
 */
public class Source {
    public void method1() {
        System.out.println("this is Source method!");
    }
}
