public class Main {
    public static void main(String[] args) {
        int inches = 0;
        double centimeters = 0.0;
        System.out.println("Inches   Centimetres");
        for (; inches <= 10; inches++) {
            centimeters = (double) inches * 2.54;
            System.out.printf("%-9d%.2f\n", inches, centimeters);
        }
    }
}
