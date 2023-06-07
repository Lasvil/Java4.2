public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int BodyMassIndex = (int) service.calculate(84.6, 1.75);
        System.out.println(BodyMassIndex);
    }
}