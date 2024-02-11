package com.factory;

public class DessertPizzaFactory extends PizzaFactory{

	@Override
	protected Pizza createPizza(String type) {

		if (type == "Dessert")
            return new DessertPizza();

		return null;
	}

}
