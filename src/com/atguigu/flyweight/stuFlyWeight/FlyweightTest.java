package com.atguigu.flyweight.stuFlyWeight;

public class FlyweightTest {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();

        Flyweight f01 = factory.getFlyWeight("a");
        Flyweight f02 = factory.getFlyWeight("a");
        Flyweight f03 = factory.getFlyWeight("a");
        Flyweight f11 = factory.getFlyWeight("b");
        Flyweight f12 = factory.getFlyWeight("b");

        f01.operation(new UnsharedConcreteFlyweight("第1次调用a。"));
        f02.operation(new UnsharedConcreteFlyweight("第2次调用a。"));
        f03.operation(new UnsharedConcreteFlyweight("第3次调用a。"));
        f11.operation(new UnsharedConcreteFlyweight("第1次调用b。"));
        f12.operation(new UnsharedConcreteFlyweight("第2次调用b。"));    }
}
