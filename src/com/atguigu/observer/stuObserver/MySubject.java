package com.atguigu.observer.stuObserver;

import com.atguigu.strategy.stuStrategy.AbstractCalculator;

public class MySubject extends  AbstractSubject {

    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }

}
