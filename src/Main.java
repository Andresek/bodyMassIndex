public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightKg = 65.5;
        double heightM = 1.74;
        int bmi = (int) service.calculate(weightKg, heightM);
        System.out.println(bmi);
    }
}