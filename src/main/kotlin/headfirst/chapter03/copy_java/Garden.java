package headfirst.chapter03.copy_java;

public class Garden {
    public static void main(String[] args){
       Plant plant  = new Soil();
       Plant plant1 = new Soil();

       plant = new Nutrients(plant);
       plant = new Nutrients(plant);
       plant = new Tree(plant);

        System.out.println(plant.getDescription() + " $" + plant.cost());
        System.out.println(plant1.getDescription() + " $" + plant1.cost());

    }
}
