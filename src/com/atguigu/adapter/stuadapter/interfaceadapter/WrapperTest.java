package com.atguigu.adapter.stuadapter.interfaceadapter;

public class WrapperTest {
    public static void main(String[] args) {
        Sourceable sourceSub1=  new SourceSub1();
        Sourceable sourceSub2=  new SourceSub2();

        sourceSub1.method1();
        sourceSub1.method2();//没有，因为SourceSub1类没有实现method2方法
        System.out.println("===================");
        sourceSub2.method1();//没有，因为SourceSub2类没有实现method1方法
        sourceSub2.method2();

    }
}
