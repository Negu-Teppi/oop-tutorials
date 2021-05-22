package com.manhlee;

public class PizzaStore {
	public void oderPizza() {
		var pizza= new GreekPizza();
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
	}
}
