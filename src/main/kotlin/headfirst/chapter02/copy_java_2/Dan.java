package headfirst.chapter02.copy_java_2;

public class Dan implements Crew{
    @Override
    public void update(String msg) {

        System.out.println("Dan : 수신" + msg);
    }
}

