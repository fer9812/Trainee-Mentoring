import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of the package (in pounds): ");
        double weight = input.nextDouble();

        if (weight <= 0) {
            System.out.println("Enter a positive number.");
        } else if (weight <= 2) {
            System.out.println("The cost (in dollars): 2.5");
        } else if (weight <= 4) {
            System.out.println("The cost (in dollars): 4.5");
        } else if (weight <= 10) {
            System.out.println("The cost (in dollars): 7.5");
        } else if (weight <= 20) {
            System.out.println("The cost (in dollars): 10.5");
        } else if (weight <= 50) {
            System.out.println("It cannot be calculated because the function is not available.");
        } else {
            System.out.println("The package cannot be shipped.");
        }
    }
}
