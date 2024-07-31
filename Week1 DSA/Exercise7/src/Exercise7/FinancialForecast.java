package Exercise7;
public class FinancialForecast {

    /**
     * Recursive method to calculate future value
     *
     * @param currentValue - the current value of the investment
     * @param growthRate - the growth rate as a decimal (e.g., 0.05 for 5%)
     * @param years - the number of years into the future
     * @return the future value of the investment
     */
    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Base Case: If no years are left, return the current value
        if (years == 0) {
            return currentValue;
        }
        // Recursive Case: Calculate the future value by applying the growth rate for one year
        return calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; // Initial value
        double annualGrowthRate = 0.05; // 5% growth rate
        int forecastYears = 10; // Forecast for 10 years

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, forecastYears);
        System.out.printf("Future value after %d years: $%.2f%n", forecastYears, futureValue);
    }
}
