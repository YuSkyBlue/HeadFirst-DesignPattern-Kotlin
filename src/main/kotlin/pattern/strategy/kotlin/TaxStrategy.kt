package pattern.strategy.kotlin

interface TaxStrategy {
    fun calculateTax(income: Double): Double
}

class USTaxStrategy : TaxStrategy {
    override fun calculateTax(income: Double): Double = income * 0.30
}

class UKTaxStrategy : TaxStrategy {
    override fun calculateTax(income: Double): Double = income * 0.25
}

class TaxCalculator(private val strategy: TaxStrategy) {
    fun calculate(income: Double): Double = strategy.calculateTax(income)
}

fun main() {
    val usCalculator = TaxCalculator(USTaxStrategy())
    println("US Tax: ${usCalculator.calculate(10000.0)}")

    val ukCalculator = TaxCalculator(UKTaxStrategy())
    println("UK Tax: ${ukCalculator.calculate(10000.0)}")
}