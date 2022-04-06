import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter binary digits (0000 to 1111): ");
        char[] chars = input.next().toCharArray();
        int number = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == '1') {
                number += Math.pow(2, chars.length - 1 - i);
            }
        }

        System.out.println("The decimal value is " + number);
    }
}
