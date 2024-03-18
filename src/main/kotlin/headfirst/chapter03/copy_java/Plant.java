package headfirst.chapter03.copy_java;

public abstract class Plant {
    String description ="이름 없음";

    public String getDescription(){
        return description;
    }

    public abstract double cost();
}
