package headfirst.chapter02.java;

/** 데이터를 관리하는 곳 subject -> observer*/
 interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}