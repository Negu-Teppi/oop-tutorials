package Stores;

import Pizza.Base.Pizza;
import Pizza.HCMPizza.HCMCheesePizza;
import Pizza.HCMPizza.HCMGreekPizza;
import Pizza.HCMPizza.HCMPepperoniPizza;
import Stores.Base.PizzaStore;

public class HCMPizzaStore extends PizzaStore{

	@Override
	public Pizza createPizza(String type) {
		switch (type) {
		case "cheese":
			return new HCMCheesePizza();
		case "greek":
			return new HCMGreekPizza();
		case "pepperoni":
			return new HCMPepperoniPizza();
		default:
			return null;
		}
	}

}
