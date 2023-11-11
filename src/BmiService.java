public class BmiService {
    public int calculate(double weightKg, double heightM) {
        if (weightKg < 0 || heightM < 0) {
            weightKg = 0;
        }

        return (int) (weightKg / (heightM * heightM));
    }
}

