package Stores;

import Pizza.Base.Pizza;
import Pizza.HNPizza.HNCheesePizza;
import Pizza.HNPizza.HNGreekPizza;
import Pizza.HNPizza.HNPepperoniPizza;
import Stores.Base.PizzaStore;

public class HNPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		switch (type) {
			case "cheese":
				return new HNCheesePizza();
			case "greek":
				return new HNGreekPizza();
			case "pepperoni":
				return new HNPepperoniPizza();
			default:
				return null;
		}
	}

}
