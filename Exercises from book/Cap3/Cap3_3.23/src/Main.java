import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a point with two coordinates: ");
        double x = input.nextDouble();
        double y = input.nextDouble();
        boolean inRectangle = false;

        System.out.print("Point (" + x + ", " + y + ") is ");
        if (x <= 10 / 2 && x >= -10 / 2) {
            if (y <= 5 / 2 && y >= -5 / 2) {
                inRectangle = true;
            }
        }
        System.out.println(inRectangle ? "in the rectangle." : "not in the rectangle.");
    }
}
