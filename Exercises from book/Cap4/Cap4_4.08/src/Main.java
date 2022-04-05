import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = input.next().charAt(0);
        int ascii = character;

        System.out.println("The ASCII code for character " + character + " is " + ascii);
    }
}
