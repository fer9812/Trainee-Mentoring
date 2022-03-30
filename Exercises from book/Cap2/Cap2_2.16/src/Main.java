import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();
        double area = 3 * Math.pow(3, 0.5) * side * side / 2;
        System.out.println("The area of the hexagon is " + area);
    }
}
