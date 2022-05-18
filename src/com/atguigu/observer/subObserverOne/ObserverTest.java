package com.atguigu.observer.subObserverOne;

public class ObserverTest {
    public static void main(String[] args) {
        Subject subject=new ConcreteSubject();//创建一个具体目标
        Observer observer1=new ConcreteObserver1();//创建一个具体观察者1
        Observer observer2=new ConcreteObserver2();//创建一个具体观察者2

        /**
         * 下面两个创建的对象，
         * 就类似于公众号更新了
         */
        subject.add(observer1);
        subject.add(observer2);
        /**
         * 把更新的内容推送给关注本公众号的账号
         */
        subject.notifyObserver();
    }
}
