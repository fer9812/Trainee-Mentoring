import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        int unicode = character;

        System.out.println("The Unicode code for the character " + character + " is " + unicode);
    }
}
