package com.atguigu.responsibilitychain.stuResponsibilitychain;
//创建处理链，并向链头的具体处理者对象提交请求，它不关心处理细节和请求的传递过程。
public class ConcreteHandler2 extends Handler {
    public void handleRequest(String request) {
        if (request.equals("two")) {
            System.out.println("具体处理者2负责处理该请求！");
        } else {
            if (getNext() != null) {
                getNext().handleRequest(request);
            } else {
                System.out.println("没有人处理该请求！");
            }
        }
    }
}
