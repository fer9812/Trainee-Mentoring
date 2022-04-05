import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Guess the result of a coin flip, Enter 0 for heads and 1 for tails: ");
        int userInput = input.nextInt();

        // Little trick for ...
        System.out.print("Coin flipping ");
        for (int i = 0; i < 3; i++) {
            System.out.print(".");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        int coinSide = (int) (Math.random() * 2);
        System.out.println(coinSide == 0 ? "\nIt is heads." : "\nIt is tails.");
        System.out.println(userInput == 0 ? "Your guess is heads." : "Your guess is tails.");
        System.out.println(userInput == coinSide ? "GOOD JOB!" : "TRY AGAIN!");
    }
}
