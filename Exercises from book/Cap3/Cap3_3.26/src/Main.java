import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        boolean isDivAnd = (number % 4 == 0) && (number % 5 == 0);
        boolean isDivOr = (number % 4 == 0) || (number % 5 == 0);
        boolean isDivXor = (number % 4 == 0) ^ (number % 5 == 0);

        System.out.println("Is " + number + " divisible by 4 and 5? " + isDivAnd);
        System.out.println("Is " + number + " divisible by 4 or 5? " + isDivOr);
        System.out.println("Is " + number + " divisible by 4 or 5, but not both? " + isDivXor);
    }
}
