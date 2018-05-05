package strategy.duck.behavior.impl;

import strategy.duck.behavior.QuackBehavior;

public class LoudQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Loud strategy.duck.behavior.impl.Quack!!");
    }
}
