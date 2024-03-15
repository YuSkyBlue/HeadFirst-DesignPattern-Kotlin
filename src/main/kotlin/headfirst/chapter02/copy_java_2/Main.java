package headfirst.chapter02.copy_java_2;

 class Main {
     public static void main(String[] args){
         SkyBlue skyBlue = new SkyBlue();
         Crew tiber = new Tiber();
         Crew dan = new Dan();

         skyBlue.subscribe(tiber);
         skyBlue.subscribe(dan);
         skyBlue.upgradeCutie();

         skyBlue.unSubscribe(dan);
         skyBlue.eatFood();
     }
}
