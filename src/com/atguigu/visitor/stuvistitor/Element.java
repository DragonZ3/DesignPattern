package com.atguigu.visitor.stuvistitor;

//抽象元素类
interface Element {
    void accept(Visitor visitor);
}