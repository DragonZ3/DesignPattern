package com.atguigu.proxy.stuProxy;

public class Proxy implements Sourceable {
    private Source source;

    /**
     * 第一种写法
     */
    public Proxy() {
        super();
        this.source = new Source();
    }

    /**
     * 第二种写法
     */
//    public Proxy(Source source) {
//        super();
//        this.source = source;
//    }

    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }

    private void atfer() {
        System.out.println("after proxy!");
    }

    private void before() {
        System.out.println("before proxy!");
    }
}
