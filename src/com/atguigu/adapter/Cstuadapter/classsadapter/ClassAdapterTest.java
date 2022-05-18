package com.atguigu.adapter.Cstuadapter.classsadapter;

//客户端代码
public class ClassAdapterTest {
    public static void main(String[] args) {
        /**
         * 目的：使用新的接口，访问已存在的接口
         */
        Target adapter = new ClassAdapter();
        adapter.request();
    }
}
