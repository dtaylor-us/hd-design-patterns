package strategy.duck.behavior.impl;

import strategy.duck.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    public void fly() {
        System.out.println("I’m flying with a rocket!");
    }
}
