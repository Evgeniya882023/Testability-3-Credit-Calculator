public class CreditCalculator {
    public double calculate(double percent, double sum, double month) {
        double percentRate = percent / 12 / 100;
        return sum * (percentRate * Math.pow((1 + percentRate), month)) / (Math.pow((1 + percentRate), month) - 1);
    }
}

