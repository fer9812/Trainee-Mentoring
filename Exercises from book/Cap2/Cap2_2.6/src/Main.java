import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);		// Create new Scanner object


        System.out.print("Enter a number between 0 and 1000: ");
        int number = input.nextInt();

        // Compute the sum of the digits in the integer.
        int lessThan10 = number % 10;
        number /= 10;
        int tens = number % 10;
        number /= 10;
        int hundreds = number % 10;
        number /= 10;
        int sum = hundreds * tens * lessThan10;

        // Display results
        System.out.println("The sum of the digits is " + sum);
    }
}
