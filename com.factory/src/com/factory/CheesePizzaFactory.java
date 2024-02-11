package com.factory;


public class CheesePizzaFactory extends PizzaFactory{

	@Override
	protected Pizza createPizza(String type) {

		 if (type == "Cheese")
	            return new CheesePizza();
		return null;

	}

}
