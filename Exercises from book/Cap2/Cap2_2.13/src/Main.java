import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);	// Create a new Scanner object.
        final double monthlyInterestRate = 0.003125;	// Initialize constant value

        System.out.print("Enter the monthly saving amount: ");
        double savingAmount = input.nextDouble();

        double total = 100 * (1 + monthlyInterestRate);// Compute first month account value
        total = (100 + total) * (1 + monthlyInterestRate);// Compute second month account value
        total = (100 + total) * (1 + monthlyInterestRate);// Compute third month account value
        total = (100 + total) * (1 + monthlyInterestRate);// Compute forth month account value
        total = (100 + total) * (1 + monthlyInterestRate); // Compute fifth month account value
        total = (100 + total) * (1 + monthlyInterestRate);// Compute sixth month account value
        System.out.println("After the sixth month, the account value is " + total);
    }
}
