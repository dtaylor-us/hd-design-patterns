package factory.factory.method;

import factory.abs.factory.PizzaIngredientFactory;

public class NYStyleVeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public NYStyleVeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing" + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
