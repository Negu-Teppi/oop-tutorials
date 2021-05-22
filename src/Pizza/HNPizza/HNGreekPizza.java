package Pizza.HNPizza;

import Pizza.Base.Pizza;

public class HNGreekPizza extends Pizza{
	public HNGreekPizza() {
		super();
		name = "HN A good greek pizza";
		dough = "HN Thin dough";
		sauce = "HN Chilli sauce";
		toppings.add("Tomato");
		toppings.add("Potato");
	}
}
