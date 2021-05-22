package Pizza.HCMPizza;

import Pizza.Base.Pizza;

public class HCMGreekPizza extends Pizza{
	public HCMGreekPizza() {
		super();
		name = "A good greek pizza";
		dough = "Thin dough";
		sauce = "Chilli sauce";
		toppings.add("Tomato");
		toppings.add("Potato");
	}
}
