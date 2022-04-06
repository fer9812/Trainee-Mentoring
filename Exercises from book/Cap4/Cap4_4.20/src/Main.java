import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine();
        System.out.println("The length of the string is " + string.length());
        System.out.println("The last character of the string is " + string.charAt(string.length() - 1));
    }
}
