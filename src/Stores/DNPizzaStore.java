package Stores;

import Pizza.Base.Pizza;
import Pizza.DNPizza.DNCheesePizza;
import Pizza.DNPizza.DNGreekPizza;
import Pizza.DNPizza.DNPepperoniPizza;
import Stores.Base.PizzaStore;

public class DNPizzaStore extends PizzaStore {

	//implementation work create a Pizza with selected of customer
	@Override
	public Pizza createPizza(String type) {
		switch (type) {
		case "cheese":
			return new DNCheesePizza();
		case "greek":
			return new DNGreekPizza();
		case "pepperoni":
			return new DNPepperoniPizza();
		default:
			return null;
		}	
	}

}
