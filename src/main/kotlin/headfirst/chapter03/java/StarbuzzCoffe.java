package headfirst.chapter03.java;

public class StarbuzzCoffe
{
//    OCP를 준수하는, 확장엔 열려있고 변경엔 닫힌 멋진 코드를 짤 수 있습니다
//    클래스가 많아진다
//    클래스의 구성을 파악하기 힘들다
//    구성 요소의 초기화 코드가 복잡해진다 ! 팩토리 및 빌더 패턴으로 개선 가능
    public static void main(String[] args){
        Beverage beverage = new Espresso();

        Beverage beverage2 = new Espresso();
        beverage = new Mocha(beverage); // Mocha로 감싼다
        beverage = new Mocha(beverage); // Mocha로 감싼다
        beverage = new Whip(beverage); // Whip으로 감싼다

        // 에스프레소 커피, 모카, 모카, 휘핑크림 $2.49
        System.out.println(beverage.getDescription() + " $" + beverage.cost());
        // 에스프레소 커피 $1.99
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

    }
}
