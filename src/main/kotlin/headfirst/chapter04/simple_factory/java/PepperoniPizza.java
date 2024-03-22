package headfirst.chapter04.simple_factory.java;

public class PepperoniPizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("PepperoniPizza Prepare");
    }

    @Override
    public void bake() {
        System.out.println(" PepperoniPizza bake");
    }

    @Override
    public void cut() {
        System.out.println("PepperoniPizza cut");
    }

    @Override
    public void box() {
        System.out.println(" PepperoniPizza box");
    }
}
