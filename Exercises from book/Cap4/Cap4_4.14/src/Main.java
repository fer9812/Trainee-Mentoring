import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a letter grade: ");
        char character = input.next().charAt(0);

        String chars = "ABCDF";
        int position = chars.indexOf(character);
        if (position == -1) {
            System.out.println(character + " is an invalid grade");
        } else {
            System.out.println("The numeric value for grade " + character + " is " + (4 - position));
        }
    }
}
