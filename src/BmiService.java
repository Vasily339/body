public class BmiService {
    public double calculate(double growth, double weight) {
        double result;
        result = weight / (growth * growth);
        return (int) result;
    }
}
