package headfirst.chapter03.copy_java;

public class Soil extends Plant{

     public Soil(){
         description = "흙";
     }
    @Override
    public double cost() {
        return 4000;
    }
}
