package headfirst.chapter02.copy_java;

import java.util.Objects;

public class MatchingDisplay implements  Observer,DisplayElement  {
    private float height;
    private float face;

    private IdealData idealData;

    public MatchingDisplay(IdealData idealData){
        this.idealData = idealData;
        idealData.registerObserver(this);
    }

    @Override
    public void update(float height, float face, float rich) {
        this.face =face;
        this.height =height;
        display();
    }
    @Override
    public void display() {
        System.out.println("now face: " + face + ", 키 : " + height);
    }
}
