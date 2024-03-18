package headfirst.chapter03.copy_java;

public class Flower extends IndoorPlant{
    Flower(Plant plant){
        this.plant = plant;
    }
    @Override
    public String getDescription() {
        return plant.getDescription() + ", 장미";
    }

    @Override
    public double cost() {
        return plant.cost() + 2000;
    }
}
