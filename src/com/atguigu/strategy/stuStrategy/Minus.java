package com.atguigu.strategy.stuStrategy;

/**
 * 算法二
 */
public class Minus extends AbstractCalculator implements ICalculator{
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}
