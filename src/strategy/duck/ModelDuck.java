package strategy.duck;

import strategy.behavior.impl.FlyNoWay;
import strategy.behavior.impl.Quack;

public class ModelDuck extends Duck {
    public ModelDuck(){
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model strategy.duck");
    }


}
