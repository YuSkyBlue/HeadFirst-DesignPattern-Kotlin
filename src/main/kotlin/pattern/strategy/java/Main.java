package pattern.strategy.java;

public class Main {
    public static void main(String[] args) {
        TaxCalculator usCalculator = new TaxCalculator(new USTaxStrategy());
        System.out.println("US Tax: " + usCalculator.calculate(10000));

        TaxCalculator ukCalculator = new TaxCalculator(new UKTaxStrategy());
        System.out.println("UK Tax: " + ukCalculator.calculate(10000));
    }
}