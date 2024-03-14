package headfirst.chapter01.java;

 class Application {
     /** interface -> FlyBehavior , QuackBehavior
      * mehthod -> performFly() / setFlyBehavior / display() / swim()
      * class -> MallardDuck / RedheadDuck / RubberDuck
      * */

    public static void main(String[] args) {
        Duck rubber = new RubberDuck();
        rubber.performFly();
        rubber.setFlyBehavior(new FlyWithWings());
        rubber.performFly();
        System.out.println("----------------------------");

        Duck muteDuck = new MallardDuck();
        muteDuck.performFly();
        muteDuck.setFlyBehavior(new FlyNoWay());
        muteDuck.performFly();
    }
}