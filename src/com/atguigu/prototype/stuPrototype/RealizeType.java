package com.atguigu.prototype.stuPrototype;
//具体原型类
//提供了浅克隆的 clone() 方法
public class RealizeType implements Cloneable {
    RealizeType() {
        System.out.println("具体原型创建成功！");
    }

    public Object clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return super.clone();
    }
}
