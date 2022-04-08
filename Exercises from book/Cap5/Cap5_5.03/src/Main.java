public class Main {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        System.out.println("Celsius   Fahrenheit");
        for (int count = 0; count <= 100; count += 2) {
            celsius = count;
            fahrenheit = celsius * 9 / 5 + 32;
            System.out.printf("%-3.0f%17.1f\n", celsius, fahrenheit);
        }
    }
}
