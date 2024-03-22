package headfirst.chapter04.pizzafm.java;


import headfirst.chapter04.pizzafm.java.store.ChicagoPizzaStore;
import headfirst.chapter04.pizzafm.java.store.NYPizzaStore;
import headfirst.chapter04.pizzafm.java.store.PizzaStore;

class Application {
    public static void main(String[] args){
        PizzaStore cg = new ChicagoPizzaStore();
        PizzaStore ny = new NYPizzaStore();
        Pizza pizza = cg.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");
        pizza = ny.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza.getName() + "\n");

    }
}
