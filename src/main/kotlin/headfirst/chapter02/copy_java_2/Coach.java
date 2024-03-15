package headfirst.chapter02.copy_java_2;

public interface Coach {
    void subscribe(Crew crew);
    void unSubscribe(Crew crew);
    void notifyCrew(String msg);
}
