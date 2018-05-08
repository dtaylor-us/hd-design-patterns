package strategy.behavior.impl;

import strategy.behavior.QuackBehavior;

public class LoudQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Loud strategy.behavior.impl.Quack!!");
    }
}
