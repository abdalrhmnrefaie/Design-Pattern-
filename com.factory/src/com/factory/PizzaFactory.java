package com.factory;



public abstract class PizzaFactory {
	
    public final Pizza getPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        pizza.component();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}
