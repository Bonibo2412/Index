public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double heightM = 1.7;
        double weightKg = 55;
        double bmi = service.calculate(weightKg, heightM);


        System.out.println(bmi);

    }
}
