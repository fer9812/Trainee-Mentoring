import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first country: ");
        String country1 = input.nextLine();
        System.out.print("Enter the second country: ");
        String country2 = input.nextLine();
        System.out.print("Enter the third country: ");
        String country3 = input.nextLine();

        String temp;

        if (country1.compareTo(country2) > 0) {
            temp = country1;
            country1 = country2;
            country2 = temp;
        }
        if (country2.compareTo(country3) > 0) {
            temp = country2;
            country3 = country2;
            country2 = temp;
        }
        if (country1.compareTo(country2) > 0) {
            temp = country1;
            country1 = country2;
            country2 = temp;
        }
        System.out.println("The three countries in descending order are " + country3 + " " + country2 +" "+ country1);
    }
}
