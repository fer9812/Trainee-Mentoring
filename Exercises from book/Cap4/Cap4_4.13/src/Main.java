import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char character = input.next().charAt(0);

        String chars = "aeiouAEIOUbcdfghjklmpqrstvwxyzBCDFGHJKLMPQRSTVWXY";
        int position = chars.indexOf(character);
        if (position == -1) {
            System.out.println(character + " is an invalid input");
        } else {
            System.out.print(character);
            System.out.println((position <= 9) ? " is a vowel" : " is a consonant");
        }
    }
}
