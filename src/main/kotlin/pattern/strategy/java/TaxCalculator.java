package pattern.strategy.java;

public class TaxCalculator {
    private TaxStrategy strategy;

    public TaxCalculator(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculate(double income) {
        return strategy.calculateTax(income);
    }
}