public class Main {
    public static void main(String[] args) {
        double celsius1, fahrenheit1, celsius2, fahrenheit2;
        System.out.println("Celsius   Fahrenheit | Fahrenheit   Celsius");
        for (int count = 0; count <= 100; count += 2) {
            celsius1 = count;
            fahrenheit2 = 20 + count / 2 * 5;
            fahrenheit1 = celsius1 * 9 / 5 + 32;
            celsius2 = (fahrenheit2 - 32) / 9 * 5;
            System.out.printf("%-3.0f%17.3f | %-3.0f%17.3f\n", celsius1, fahrenheit1, fahrenheit2, celsius2);
        }
    }
}
