package com.jimzhang.design.strategy;

/**
 * @author jimzhang
 * <>具体实现</>
 * @version V1.0.0
 * @date 2018-04-20 9:01
 */
public class ConcreteStrategy1 implements IStrategy {
    @Override
    public void doSomething() {
        System.out.println("具体策略1");
    }
}
