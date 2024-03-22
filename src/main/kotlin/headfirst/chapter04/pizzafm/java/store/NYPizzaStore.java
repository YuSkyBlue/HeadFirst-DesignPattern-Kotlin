package headfirst.chapter04.pizzafm.java.store;

import headfirst.chapter04.pizzafm.java.Pizza;
import headfirst.chapter04.pizzafm.java.menu.nystyle.NYStyleCheesePizza;
import headfirst.chapter04.pizzafm.java.menu.nystyle.NYStyleClamPizza;
import headfirst.chapter04.pizzafm.java.menu.nystyle.NYStylePepperoniPizza;
import headfirst.chapter04.pizzafm.java.menu.nystyle.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
		if (item.equals("cheese")) {
			return new NYStyleCheesePizza();
		} else if (item.equals("veggie")) {
			return new NYStyleVeggiePizza();
		} else if (item.equals("clam")) {
			return new NYStyleClamPizza();
		} else if (item.equals("pepperoni")) {
			return new NYStylePepperoniPizza();
		} else return null;
	}
}
