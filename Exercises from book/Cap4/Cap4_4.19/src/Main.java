import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN: ");
        String originalNum = input.next();
        int d1 = originalNum.charAt(0) - 48;
        int d2 = originalNum.charAt(1) - 48;
        int d3 = originalNum.charAt(2) - 48;
        int d4 = originalNum.charAt(3) - 48;
        int d5 = originalNum.charAt(4) - 48;
        int d6 = originalNum.charAt(5) - 48;
        int d7 = originalNum.charAt(6) - 48;
        int d8 = originalNum.charAt(7) - 48;
        int d9 = originalNum.charAt(8) - 48;

        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        System.out.println(d10 == 10 ? (originalNum + "X") : (originalNum + Integer.toString(d10)));
    }
}
