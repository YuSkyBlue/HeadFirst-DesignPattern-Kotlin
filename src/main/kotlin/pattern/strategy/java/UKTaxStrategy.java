package pattern.strategy.java;

public class UKTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        return income * 0.25; // Simplified tax calculation
    }
}