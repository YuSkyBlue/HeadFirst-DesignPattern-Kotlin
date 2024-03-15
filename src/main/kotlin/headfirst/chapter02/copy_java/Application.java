package headfirst.chapter02.copy_java;


/** Observe Pattern*/
class Application {
     public static void main(String[] args){
         IdealData idealData = new IdealData();

         MatchingDisplay matchingDisplay = new MatchingDisplay(idealData);
         idealData.setMeasurements(180,10, 10);

     }
}
