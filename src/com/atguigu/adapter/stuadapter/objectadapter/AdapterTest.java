package com.atguigu.adapter.stuadapter.objectadapter;

public class AdapterTest {
    public static void main(String[] args) {
        Targetable targetable = new Wrapper(new Source());//这里使用的是对象适配器
        targetable.method1();
        targetable.method2();

    }
}
