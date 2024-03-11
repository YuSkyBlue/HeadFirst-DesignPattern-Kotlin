package pattern.strategy.java;

public class USTaxStrategy implements TaxStrategy {
    @Override
    public double calculateTax(double income) {
        return income * 0.30; // Simplified tax calculation
    }
}

