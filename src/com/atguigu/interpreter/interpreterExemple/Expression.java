package com.atguigu.interpreter.interpreterExemple;

//抽象表达式类

/**
 * 定义解释器的接口，约定解释器的解释操作，主要包含解释方法 interpret()。
 */
interface Expression {
    public boolean interpret(String info);
}
