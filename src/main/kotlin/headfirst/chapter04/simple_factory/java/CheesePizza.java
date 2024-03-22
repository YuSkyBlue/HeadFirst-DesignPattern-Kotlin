package headfirst.chapter04.simple_factory.java;

 class CheesePizza implements Pizza{
    @Override
    public void prepare() {
        System.out.println("CheesePizza Prepare");
    }

    @Override
    public void bake() {
        System.out.println("CheesePizza bake");
    }

    @Override
    public void cut() {
        System.out.println("CheesePizza cut");
    }

    @Override
    public void box() {
        System.out.println("CheesePizza box");
    }
}
