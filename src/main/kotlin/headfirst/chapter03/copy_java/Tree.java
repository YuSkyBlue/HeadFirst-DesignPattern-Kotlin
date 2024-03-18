package headfirst.chapter03.copy_java;

public class Tree extends IndoorPlant{
    public Tree(Plant plant){
        this.plant = plant;
    }


    @Override
    public String getDescription() {
        return plant.getDescription() + ",나무";
    }

    @Override
    public double cost() {
        return plant.cost() + 100000;
    }
}
