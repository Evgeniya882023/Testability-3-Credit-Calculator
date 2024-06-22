public class CreditCalculator {
    public double calculate(double percentRate, double sum, double month) {
        return sum * (percentRate * Math.pow((1 + percentRate), month)) / (Math.pow((1 + percentRate), month) - 1);
    }
}

