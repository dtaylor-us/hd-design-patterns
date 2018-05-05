package strategy.duck.behavior.impl;

import strategy.duck.behavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I’m NOT flying!!");
    }
}
