public class Main {
    public static void main(String[] args) {
        double ping1, squareMeter1, ping2, squareMeter2;
        System.out.println("Celsius   Fahrenheit | Fahrenheit   Celsius");
        for (int count = 0; count <= 14; count++) {
            ping1 = count * 5 + 10;
            squareMeter1 = 3.305 * ping1;
            squareMeter2 = count * 5 + 30;
            ping2 = squareMeter2 / 3.305;
            System.out.printf("%-3.0f%17.3f | %-3.0f%17.3f\n", ping1, squareMeter1, squareMeter2, ping2);
        }
    }
}
