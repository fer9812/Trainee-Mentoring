import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        int optionBelow;

            System.out.println("What was the first president of USA? ");
            System.out.println("Please select the correct option from three statements below ");
            System.out.println("                                     ");
            System.out.println("Options: ");
            System.out.println("1- George Washington.");
            System.out.println("2- Donald Trump ");
            System.out.println("3- Andres Manuel");
            Scanner inputBelowAux = new Scanner(System.in);
            optionBelow = inputBelowAux.nextInt();
        while (optionBelow <= 3){
            if (optionBelow == 1) {
                System.out.println("Correct!!");
                break;
            }else if (optionBelow == 2){
                System.out.println("Wrong!! DJT It's 46!!");
                break;
            }else if (optionBelow == 3){
                System.out.println("AMLO It's from Mexico!!");
                break;
            }

        }
        System.out.println("Invalid number!!");
    }
}
