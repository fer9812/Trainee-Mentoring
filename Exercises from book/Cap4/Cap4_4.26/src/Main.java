import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an amount, for example 11.56: ");
        String amountStr = input.nextLine();
        int dollar = 0;
        int cent = 0;

        int position = amountStr.indexOf('.');
        if (position == -1) {
            dollar = Integer.parseInt(amountStr);
        } else {
            dollar = Integer.parseInt(amountStr.substring(0, position));
            cent = Integer.parseInt((amountStr.substring(position + 1) + "00").substring(0, 2));
        }

        int numberOfOneDollars = dollar;
        int remainingAmount = cent;

        int numberOfQuarters = remainingAmount / 25;
        remainingAmount = remainingAmount % 25;

        int numberOfDimes = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;

        int numberOfNickels = remainingAmount / 5;
        remainingAmount = remainingAmount % 5;

        int numberOfPennies = remainingAmount;

        System.out.println("Your amount " + amountStr + " consists of");
        System.out.println("    " + numberOfOneDollars + " dollars");
        System.out.println("    " + numberOfQuarters + " quarters ");
        System.out.println("    " + numberOfDimes + " dimes");
        System.out.println("    " + numberOfNickels + " nickels");
        System.out.println("    " + numberOfPennies + " pennies");
    }
}
