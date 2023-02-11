public class BmiService {
    public double calculate(double weightKg, double heightM) {
        return weightKg / (heightM * heightM);
    }
}