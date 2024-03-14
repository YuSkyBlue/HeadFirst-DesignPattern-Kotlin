package headfirst.chapter01.copy_java;

abstract class Flower {
    SmellBehavior smellBehavior;
    ColorFulBehavior colorFulBehavior;

    public void performSmell(){
        smellBehavior.smell();
    }
    public void performColorFul(){
        colorFulBehavior.color();
    }
    public void setSmellBehavior(SmellBehavior sb){
        this.smellBehavior = sb;
    }
    public void setColorFulBehavior(ColorFulBehavior cf){
        this.colorFulBehavior = cf;
    }

    abstract void tree();
}
