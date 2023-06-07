public class BmiService {
    public double calculate(double weightInKilogram, double heightInMeters) {
        double result = weightInKilogram / (heightInMeters * heightInMeters);
        int bmi = (int) result;
        return bmi;
    }
}