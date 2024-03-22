package headfirst.chapter04.pizzafm.java.store;

import headfirst.chapter04.pizzafm.java.Pizza;
import headfirst.chapter04.pizzafm.java.menu.chicago.ChicagoStyleCheesePizza;
import headfirst.chapter04.pizzafm.java.menu.chicago.ChicagoStyleClamPizza;
import headfirst.chapter04.pizzafm.java.menu.chicago.ChicagoStylePepperoniPizza;
import headfirst.chapter04.pizzafm.java.menu.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	Pizza createPizza(String item) {
        	if (item.equals("cheese")) {
            		return new ChicagoStyleCheesePizza();
        	} else if (item.equals("veggie")) {
        	    	return new ChicagoStyleVeggiePizza();
        	} else if (item.equals("clam")) {
        	    	return new ChicagoStyleClamPizza();
        	} else if (item.equals("pepperoni")) {
            		return new ChicagoStylePepperoniPizza();
        	} else {
				return null;
			}
	};
}
