package headfirst.chapter03.copy_java;

public class Nutrients extends  Plant{
    public Nutrients(Plant plant){
        description = "영양제";
    }
    @Override
    public double cost() {
        return 4000;
    }
}
