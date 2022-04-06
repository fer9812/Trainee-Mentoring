import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char character = input.next().charAt(0);

        String chars = "ABCabcDEFdefGHIghiJKLjklMNOmnoPQRSpqrsTUVtuvWXYZwxyz";
        int position = chars.indexOf(character);
        int number = -1;
        if (position >= 0 && position < 6) {
            number = 2;
        } else if (position >= 6 && position < 12) {
            number = 3;
        } else if (position >= 12 && position < 18) {
            number = 4;
        } else if (position >= 18 && position < 24) {
            number = 5;
        } else if (position >= 30 && position < 36) {
            number = 6;
        } else if (position >= 36 && position < 44) {
            number = 7;
        } else if (position >= 44 && position < 50) {
            number = 8;
        } else if (position >= 50 && position < 58) {
            number = 9;
        }

        if (number == -1) {
            System.out.println(character + " is an invalid input");
        } else {
            System.out.println("The corresponding number is " + number);
        }
    }
}
