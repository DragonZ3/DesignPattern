package com.atguigu.builder.stuBuilder;
//产品
public class Product {
    private String A;
    private String B;
    private String C;

    public void setA(String a) {
        A = a;
    }

    public void setB(String b) {
        B = b;
    }

    public void setC(String c) {
        C = c;
    }
    public String show(){
        return A+",模块创建完成了。"+B+"，模块创建完成了。"+C+"，模块创建完成了。";
    }

}
