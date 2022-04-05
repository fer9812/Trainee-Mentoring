import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, number3;

        number1 = (int) (System.currentTimeMillis() % 10);//Generate three single-digit integers
        number2 = (int) (System.currentTimeMillis() / 7 % 10);
        number3 = (int) (System.currentTimeMillis() / 70 % 10);

        Scanner input = new Scanner(System.in);
        System.out.print("What is " + number1 + " * " + number2 + " * " + number3 + "? ");
        int answer = input.nextInt();

        System.out.println(number1 + " * " + number2 + " * " + number3 + " = " + answer + " is " +
                (number1 * number2 * number3 == answer));
    }
}
