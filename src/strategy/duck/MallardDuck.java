package strategy.duck;

import strategy.duck.behavior.impl.FlyWithWings;
import strategy.duck.behavior.impl.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("I’m a real Mallard strategy.duck");
    }
}
