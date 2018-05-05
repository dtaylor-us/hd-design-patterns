package strategy.duck;

import strategy.duck.behavior.impl.FlyNoWay;
import strategy.duck.behavior.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model strategy.duck");
    }


}
