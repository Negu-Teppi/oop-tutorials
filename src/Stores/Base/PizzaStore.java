package Stores.Base;

import Pizza.Base.Pizza;

public abstract class PizzaStore {
	public void orderPizza(String type) {
		//create a pizza when the order
		Pizza pizza;
		
		pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
	//create a abstract method to subclass implementation 
	protected abstract Pizza createPizza(String type); 
	
	
}
