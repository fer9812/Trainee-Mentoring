import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = 0;
        while (score != -1) {
            System.out.print("Enter your score: ");
            score = input.nextInt();
            if (score == -1) {
                System.out.println("No numbers are entered except 0");
                break;
            } else if (score < 0) {
                System.out.println("Negative input, please check again.");
            } else if (score > 100) {
                System.out.println("Score won't exceed 100");
            } else if (score >= 60) {
                System.out.println("You pass the exam.");
            } else {
                System.out.println("You fail the exam.");
            }
        }
        System.out.println();
    }
}
