import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int userInput = input.nextInt();
        int computer = (int) (Math.random() * 3);

        String userStr = "", computerStr = "", resultStr = "";
        switch (userInput) {
            case 0:
                userStr = "scissor";
                break;
            case 1:
                userStr = "rock";
                break;
            case 2:
                userStr = "paper";
                break;
            default:
                userStr = "Invalid Input";
        }

        switch (computer) {
            case 0:
                computerStr = "scissor";
                break;
            case 1:
                computerStr = "rock";
                break;
            case 2:
                computerStr = "paper";
                break;
        }

        int result = userInput - computer;
        switch (result) {
            case -2:
            case 1:
                resultStr = ". You won.";
                break;
            case 0:
                resultStr = " too. It is a draw";
                break;
            default:
                resultStr = ". You lost.";
        }
        System.out.println("The computer is " + computerStr + ". You are " + userStr + resultStr);
    }
}
