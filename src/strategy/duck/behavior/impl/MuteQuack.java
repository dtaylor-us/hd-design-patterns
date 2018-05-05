package strategy.duck.behavior.impl;

import strategy.duck.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("Mute strategy.duck.behavior.impl.Quack");
    }
}
