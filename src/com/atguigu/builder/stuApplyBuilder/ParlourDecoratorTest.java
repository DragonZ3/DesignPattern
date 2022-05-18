package com.atguigu.builder.stuApplyBuilder;

//测试：客厅装饰
public class ParlourDecoratorTest {
    public static void main(String[] args) {

        Decorator builder = new ConcreteDecorator1();
        ProjectManager manager = new ProjectManager(builder);
        Parlour parlour = manager.decorate();
        parlour.show();
    }
}
