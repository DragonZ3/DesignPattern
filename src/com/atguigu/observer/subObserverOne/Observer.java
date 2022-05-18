package com.atguigu.observer.subObserverOne;

//抽象观察者
//它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用。
interface Observer {
    void response(); //反应(当接到具体主题的更改通知时被调用。)
}