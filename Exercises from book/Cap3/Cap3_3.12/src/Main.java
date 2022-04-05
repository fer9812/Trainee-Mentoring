import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int originalNum = input.nextInt();
        int lastDigit = originalNum % 10;
        int firstDigit = originalNum / 100;
        System.out.print(originalNum);
        System.out.println(lastDigit == firstDigit ? " is a palindrome" : " is not a palindrome");
    }
}
