package com.atguigu.strategy.stuStrategy;

/**
 * 策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，
 * 对各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 */
public class StrategyTest {
    public static void main(String[] args) {

        /**
         * 需要使用什么算法由用户去选择
         */

        System.out.println("========此时调用的是加法算法=============");
        String exp = "2+8";
        ICalculator cal = new Plus();//此时调用的是加法算法
        int result = cal.calculate(exp);
        System.out.println(result);

        System.out.println("========此时调用的是乘法算法=============");
        String exp2 = "2*8";
        ICalculator multiply = new Multiply();//此时调用的是乘法算法
        System.out.println(multiply.calculate(exp2));


        System.out.println("========此时调用的是减法算法=============");
        String exp3 = "100-20";
        //此时调用的是乘法算法
        ICalculator minus = new Minus();
        System.out.println(minus.calculate(exp3));


    }
}
