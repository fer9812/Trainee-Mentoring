import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a SSN: ");
        String string = input.nextLine();
        boolean isValid = true;


        if ((Character.isDigit(string.charAt(0)) == false) || (Character.isDigit(string.charAt(1)) == false) ||
                (Character.isDigit(string.charAt(2)) == false) || (Character.isDigit(string.charAt(4)) == false) ||
                (Character.isDigit(string.charAt(5)) == false) || (Character.isDigit(string.charAt(7)) == false) ||
                (Character.isDigit(string.charAt(8)) == false) || (Character.isDigit(string.charAt(9)) == false) ||
                (Character.isDigit(string.charAt(10)) == false) || (string.length() > 11) ||
                (string.charAt(3) != '-') || (string.charAt(6) != '-')) {
            isValid = false;
        }
        System.out.println(isValid ?
                (string + " is a valid social security number") : (string + " is a invalid social security number"));
    }
}
