package com.atguigu.interpreter.interpreterExemple;

/*文法规则
  <expression> ::= <city>的<person>
  <city> ::= 韶关|广州
  <person> ::= 老人|妇女|儿童
*/

/**
 * 主要任务是将需要分析的句子或表达式转换成使用解释器对象描述的抽象语法树，
 * 然后调用解释器的解释方法，当然也可以通过环境角色间接访问解释器的解释方法。
 */
public class InterpreterPatternDemo {
    public static void main(String[] args) {
        Context bus = new Context();
        bus.freeRide("韶关的老人");
        bus.freeRide("韶关的年轻人");
        bus.freeRide("广州的妇女");
        bus.freeRide("广州的儿童");
        bus.freeRide("山东的儿童");
    }
}