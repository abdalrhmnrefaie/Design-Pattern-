package com.factory;

import java.util.ArrayList;

public abstract class Pizza {

	
    protected String name;
    protected String dough;
    protected String sauce;

    protected ArrayList<String> toppings = new ArrayList<>();
    
    public void prepare() {
        System.out.println("Preparing pizza");
    }

    public void bake() {
        System.out.println("Baking pizza");
    }

    public void cut() {
        System.out.println("Cut pizza");
    }

    public void box() {
        System.out.println("Pack the pizza");
    }
    
    public void component() {
        System.out.println("Pizza Ingredients-->" +"Name :"+name+" Dough:"+dough+" Sauce:"+sauce +" Toppings:"+toppings);
    }

	public String getName() {
		return name;
	}

    
    

}
