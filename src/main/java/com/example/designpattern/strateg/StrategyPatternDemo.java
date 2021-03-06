package com.example.designpattern.strateg;

/**
 * @Auther: lingjun, hkh
 * @Date: 2018/7/4 23:24
 * @Description: 策略模式
 */
public class StrategyPatternDemo{

        public static void main(String[] args) {
            Context context = new Context(new OperationAdd());
            System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

            context = new Context(new OperationSubstract());
            System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

            context = new Context(new OperationMultiply());
            System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
        }
}
