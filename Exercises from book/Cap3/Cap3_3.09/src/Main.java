import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int originalNum = input.nextInt();
        int remainNum = originalNum;
        int d9 = remainNum % 10;
        remainNum /= 10;
        int d8 = remainNum % 10;
        remainNum /= 10;
        int d7 = remainNum % 10;
        remainNum /= 10;
        int d6 = remainNum % 10;
        remainNum /= 10;
        int d5 = remainNum % 10;
        remainNum /= 10;
        int d4 = remainNum % 10;
        remainNum /= 10;
        int d3 = remainNum % 10;
        remainNum /= 10;
        int d2 = remainNum % 10;
        remainNum /= 10;
        int d1 = remainNum % 10;
        int d10 = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;

        String ISBN10str = String.format("%09d", originalNum); // Append "0" on the left to make it 9 digits
        if (d10 == 10) {
            ISBN10str += "X";
        } else {
            ISBN10str += d10;
        }

        System.out.print("The ISBN-10 number is " + ISBN10str);
    }
}
