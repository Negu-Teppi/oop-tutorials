package Pizza.HNPizza;

import Pizza.Base.Pizza;

public class HNGreekPizza extends Pizza{
	public HNGreekPizza() {
		super();
		name = "A good greek pizza";
		dough = "Thin dough";
		sauce = "Chilli sauce";
		toppings.add("Tomato");
		toppings.add("Potato");
	}
}
