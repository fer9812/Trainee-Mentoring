import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the exchange rate from dollars to RMB: ");
        double exchangeRate = input.nextDouble();
        System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
        double convertDirection = input.nextDouble(); // 0 for dollars to RMB, 1 for RMB to dollars

        double dollars, rmb;
        if (convertDirection == 0) {
            System.out.print("Enter the dollar amount: ");
            dollars = input.nextDouble();
            rmb = dollars * exchangeRate;
            System.out.println("$" + dollars + " is " + rmb + " yuan");
        } else {
            System.out.print("Enter the RMB amount: ");
            rmb = input.nextDouble();
            dollars = rmb / exchangeRate;
            System.out.println(rmb + " yuan is $" + dollars);
        }
    }
}
