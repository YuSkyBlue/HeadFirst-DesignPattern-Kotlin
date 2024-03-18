package headfirst.chapter03.java;

/**💡 OCP(Open-Closed Principle
 * 클래스 확장에는 열려있어야 하지만 변경에는 닫혀있어야 한다.
 * Decorator 패턴
 * 데코레이터는 자신이 장식하는 객체에게 행동을 위임하거나 추가작업을 수행할 수 있습니다.
 * 데코레이터의 슈퍼클래스는 자신이 장식하는 객체의 슈퍼클래스와 같습니다. 그래서, 원래 객체가 들어갈 자리에 데코레이터 객체를 넣어도 됩니다.
 * 한 객체를 여러개의 데코레이터로 감쌀 수 있습니다.
 * 객체는 언제든지 감쌀 수 있으므로, 동적으로 적용할 수 있습니다.*/
public abstract class Beverage{
    String description = "제목 없음";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}
