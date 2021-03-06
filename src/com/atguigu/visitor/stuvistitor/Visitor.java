package com.atguigu.visitor.stuvistitor;

//抽象访问者
//定义一个访问具体元素的接口，为每个具体元素类对应一个访问操作 visit() ，
//该操作中的参数类型标识了被访问的具体元素。
interface Visitor {
    void visit(ConcreteElementA element);
    void visit(ConcreteElementB element);
}
