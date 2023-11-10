public class BmiService {
    public double calculate(double weightKg, double heightM) {
        if (weightKg < 0 || heightM < 0) {
            weightKg = 0;
        }

        return weightKg / (heightM * heightM);
    }
}
