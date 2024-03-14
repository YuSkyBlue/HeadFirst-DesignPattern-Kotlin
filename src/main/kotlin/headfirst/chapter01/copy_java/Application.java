package headfirst.chapter01.copy_java;

class Application {
    public static void main(String[] args){
        Flower be = new BenjaminaTree();
        be.performSmell();
        be.performColorFul();
        be.tree();
        be.setColorFulBehavior(new ColorFulWay());
        be.performColorFul();
        System.out.println("--------------------");
        Flower mt = new MapleTree();
        mt.performColorFul();
        mt.performSmell();
        mt.tree();
        mt.setSmellBehavior(new SmellNoWay());
        mt.performSmell();
    }
}
