import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex digit: ");
        String chars = input.next().toUpperCase();
        char character = chars.charAt(0);

        String digits = "0123456789ABCDEF";
        int decVal = digits.indexOf(character);
        if (decVal == -1) {
            System.out.println(character + " is an invalid input");
        } else {
            String binVal = Integer.toBinaryString(decVal);
            System.out.println("The binary value is " + binVal);
        }
    }
}
