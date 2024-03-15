package headfirst.chapter02.copy_java;


import java.util.ArrayList;
import java.util.List;

public class IdealData implements Subject {
    private List<Observer> observers;
    private float height;
    private float face;
    private float rich;

    public IdealData() { this.observers = new ArrayList<>();}



    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {

    }
    public void measurementsChanged() {
        notifyObservers();
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers) {
            observer.update(height,face,rich);
        }
    }
    public void setMeasurements(float height, float face, float rich ){
        this.height = height;
        this.face =face;
        this.rich= rich;
        measurementsChanged();
    }
}
