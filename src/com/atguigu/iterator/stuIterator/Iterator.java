package com.atguigu.iterator.stuIterator;

//抽象迭代器
interface Iterator {
    Object first();
    Object next();
    boolean hasNext();
}