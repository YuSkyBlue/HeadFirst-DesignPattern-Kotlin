package headfirst.chapter01.copy_java;

public class BenjaminaTree extends Flower{

    public BenjaminaTree(){
        this.smellBehavior = new SmellNoWay();
        this.colorFulBehavior = new ColorNoWay();
    }

    @Override
    void tree() {
        System.out.println("It is Tree");
    }
}
