package Pizza;

import Stores.DNPizzaStore;
import Stores.HCMPizzaStore;
import Stores.HNPizzaStore;
import Stores.Base.PizzaStore;

public class Program {
	public static void main(String[] args) {
		PizzaStore hnPizzaStore = new HNPizzaStore();
		hnPizzaStore.orderPizza("cheese");
		PizzaStore daNangPizzaStore = new DNPizzaStore();
		daNangPizzaStore.orderPizza("cheese");
		PizzaStore hcmPizzaStore = new HCMPizzaStore();
		hcmPizzaStore.orderPizza("cheese");
	}
}
