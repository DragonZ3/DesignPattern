package com.atguigu.observer.subObserverOne;
//具体目标
//它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，
//通知所有注册过的观察者对象
public class ConcreteSubject extends Subject {
    public void notifyObserver() {
        System.out.println("具体目标发生改变...");
        System.out.println("--------------");
        for (Object obs : observers) {
            ((Observer) obs).response();
        }
    }
}
