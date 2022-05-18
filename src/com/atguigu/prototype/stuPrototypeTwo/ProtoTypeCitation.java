package com.atguigu.prototype.stuPrototypeTwo;

public class ProtoTypeCitation {
    public static void main(String[] args) throws CloneNotSupportedException {
        citation obj1 = new citation("张三", "同学：在2016学年第一学期中表现优秀，被评为三好学生。", "韶关学院");
        obj1.display();
        //用原型模式除了可以生成相同的对象，还可以生成相似的对象
        System.out.println("===================================");
        citation obj2 = (citation) obj1.clone();
        obj2.setName("李四");
        obj2.display();
        System.out.println("===================================");
        citation clone = (citation) obj1.clone();
        clone.setName("喜羊羊");
        clone.display();
    }
}
