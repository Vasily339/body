public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double growth = 1.81;
        double weight = 74;
        double bmi = service.calculate(growth, weight);
        System.out.println(bmi);
    }
}
