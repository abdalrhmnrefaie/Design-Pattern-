package com.factory;


public class Main {

	public static void main(String[] args) {

        PizzaFactory cheesePizzaFactory = new CheesePizzaFactory();
        cheesePizzaFactory.getPizza("Cheese");
        
        System.out.println("...........");

        PizzaFactory dessertPizzaFactory = new DessertPizzaFactory();
        dessertPizzaFactory.getPizza("Dessert1");
	}

}
