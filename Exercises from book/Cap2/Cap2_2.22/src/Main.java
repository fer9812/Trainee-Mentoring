import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Enter an amount as integer, for example 1156 for 11.56: ");
        int amount = input.nextInt();
        int remainingAmount = amount;

        int numberOfOneDollars = remainingAmount / 100;//number of one dollars
        remainingAmount %= 100;

        int numberOfQuarters = remainingAmount / 25;// number of quarters in the remaining amount
        remainingAmount %= 25;

        int numberOfDimes = remainingAmount / 10;// number of dimes in the remaining amount
        remainingAmount %= 10;

        int numberOfNickels = remainingAmount / 5;// Find the number of nickels in the remaining amount
        remainingAmount %= 5;

        int numberOfPennies = remainingAmount;// Find the number of pennies in the remaining amoung

        System.out.println("Your amount " + amount / 100.0 + " consists of");
        System.out.println(" " + numberOfOneDollars + " dollars");
        System.out.println(" " + numberOfQuarters + " quarters");
        System.out.println(" " + numberOfDimes + " dimes");
        System.out.println(" " + numberOfNickels + " nickels");
        System.out.println(" " + numberOfPennies + " pennies");
    }
}
