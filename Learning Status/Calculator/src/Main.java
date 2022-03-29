import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double x,y;
        String operator;
        int exit = 1;

        while(exit == 1) {

            System.out.println("Please introduce the first number: ");
            Scanner firstInput = new Scanner(System.in);
            x = firstInput.nextDouble();


            System.out.println("Please introduce the second number: ");
            Scanner secondInput = new Scanner(System.in);
            y = secondInput.nextDouble();

            System.out.println("Select an operator: (+,-,*,/)");
            Scanner thirdInput = new Scanner(System.in);
            operator = thirdInput.nextLine();


            if (operator.equals("+")) {
                System.out.println("Te result of " + x + " + " + y + " equals to: ");
                System.out.println(x + y);
                System.out.println("Do you need other operation? ");
                System.out.println("if it's yes press: 1");
                System.out.println("if it's not press: 2");
                Scanner fourthInput = new Scanner(System.in);
                exit = fourthInput.nextInt();

            } else if (operator.equals("-")) {
                System.out.println("Te result of " + x + " - " + y + " equals to: ");
                System.out.println(x - y);
                System.out.println("Do you need other operation? ");
                System.out.println("if it's yes press: 1");
                System.out.println("if it's not press: 2");
                Scanner fourthInput = new Scanner(System.in);
                exit = fourthInput.nextInt();
            } else if (operator.equals("*")) {
                System.out.println("Te result of " + x + " * " + y + " equals to: ");
                System.out.println(x * y);
                System.out.println("Do you need other operation? ");
                System.out.println("if it's yes press: 1");
                System.out.println("if it's not press: 2");
                Scanner fourthInput = new Scanner(System.in);
                exit = fourthInput.nextInt();
            } else if (operator.equals("/")) {
                System.out.println("Te result of " + x + " / " + y + " equals to: ");
                System.out.println(x / y);
                System.out.println("Do you need other operation? ");
                System.out.println("if it's yes press: 1");
                System.out.println("if it's not press: 2");
                Scanner fourthInput = new Scanner(System.in);
                exit = fourthInput.nextInt();
            }
        }
        System.out.println("Bye!!");
    }
}
