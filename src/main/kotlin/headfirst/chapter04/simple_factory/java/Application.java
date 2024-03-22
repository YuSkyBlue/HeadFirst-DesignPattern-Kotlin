package headfirst.chapter04.simple_factory.java;

 class Application {
     public static void main(String[] args){
         SimplePizzaFactory fc =  new SimplePizzaFactory();
         PizzaStore ps = new PizzaStore(fc);
         ps.orderPizza("cheeze");
         System.out.println("-------------");
         ps.orderPizza("pepperoni");

//         piz.box();
//         piz.bake();
//         piz.cut();
//
//         Pizza piz1 = fc.createPizza("pepperoni");
//         piz1.box();
//         piz1.bake();
//         piz1.cut();

     }
}
