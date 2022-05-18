package com.atguigu.bridge.stubridge;

/**
 * 桥接的用意是：将抽象化与实现化解耦，使得二者可以独立变化，
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge bridge=new MyBridge();

        /**
         * 调用第一个对象
         */
        SourceSub1 source1 = new SourceSub1();
        bridge.setSource(source1);
        bridge.method();

        System.out.println("==============================");

        /*调用第二个对象*/
        SourceSub2 sub2 = new SourceSub2();
        bridge.setSource(sub2);
        bridge.method();
    }
}
