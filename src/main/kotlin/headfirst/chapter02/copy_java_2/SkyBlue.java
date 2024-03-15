package headfirst.chapter02.copy_java_2;

import java.util.*;

public class SkyBlue implements Coach{
    private  List<Crew> crews =new ArrayList<>();
    @Override
    public void subscribe(Crew crew) {
        crews.add(crew);
    }

    @Override
    public void unSubscribe(Crew crew) {
        crews.remove(crew);
    }

    @Override
    public void notifyCrew(String msg) {
        crews.forEach(crew -> crew.update(msg));
    }

    public void eatFood(){
        System.out.println("Eat Food Start");
        notifyCrew("eat food after");
    }
    public void runway(){
        System.out.println("run Away Start");
        notifyCrew("run Away");
    }
    public void upgradeCutie(){
        System.out.println("upgradeCutie Start");
        notifyCrew("upgrade Cutie");
    }
}
