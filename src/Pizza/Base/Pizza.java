package Pizza.Base;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	protected String name;
	protected String dough;
	protected String sauce;
	protected List<String> toppings = new ArrayList<String>();
	
	public void prepare() {
		System.out.println("Preaparing " + name);
		System.out.println("Tossing dough...");
		System.out.println("Adding sauce...");
		for (String topping : toppings) {
			System.out.println("\t"+ topping);
		}
	}
	
	public void bake() {
		System.out.println("Banking "+name +" in 30 mins");
	}
	
	public void cut() {
		System.out.println("Cutting " + name);
	}
	
	public void box() {
		System.out.println("Boxing "+ name);
	}
}
