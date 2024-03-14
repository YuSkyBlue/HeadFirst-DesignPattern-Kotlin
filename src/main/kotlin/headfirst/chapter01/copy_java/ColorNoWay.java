package headfirst.chapter01.copy_java;

public class ColorNoWay implements ColorFulBehavior{
    @Override
    public void color() {
        System.out.println("아무것도의 색깔이 없음");
    }
}
