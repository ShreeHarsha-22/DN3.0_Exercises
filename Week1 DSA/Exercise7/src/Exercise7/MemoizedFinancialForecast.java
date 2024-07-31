package Exercise7;

import java.util.HashMap;
import java.util.Map;

public class MemoizedFinancialForecast {

    // Map to store previously computed results
    private static Map<Integer, Double> memo = new HashMap<>();

    public static double calculateFutureValue(double currentValue, double growthRate, int years) {
        // Base Case: If no years are left, return the current value
        if (years == 0) {
            return currentValue;
        }

        // Check if the result is already computed and stored in the map
        if (memo.containsKey(years)) {
            return currentValue * memo.get(years);
        }

        // Recursive Case: Calculate the future value by applying the growth rate for one year
        double futureValue = calculateFutureValue(currentValue * (1 + growthRate), growthRate, years - 1);
        // Store the computed result
        memo.put(years, futureValue / currentValue);
        return futureValue;
    }

    public static void main(String[] args) {
        double initialInvestment = 1000.0; // Initial value
        double annualGrowthRate = 0.05; // 5% growth rate
        int forecastYears = 10; // Forecast for 10 years

        double futureValue = calculateFutureValue(initialInvestment, annualGrowthRate, forecastYears);
        System.out.printf("Future value after %d years: $%.2f%n", forecastYears, futureValue);
    }
}
