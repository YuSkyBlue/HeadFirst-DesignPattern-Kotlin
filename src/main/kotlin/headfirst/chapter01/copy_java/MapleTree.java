package headfirst.chapter01.copy_java;

public class MapleTree extends Flower{
    public MapleTree(){
        this.colorFulBehavior = new ColorFulWay();
        this.smellBehavior = new SmellGoodWay();
    }
    @Override
    void tree() {
        System.out.println("It is Tree");
    }
}
