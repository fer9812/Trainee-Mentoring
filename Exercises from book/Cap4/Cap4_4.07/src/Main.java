import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = input.nextDouble();

        System.out.println("The coordinates of five points on the pentagon are");
        double p1x = radius * Math.cos(Math.toRadians(18));
        double p1y = radius * Math.sin(Math.toRadians(18));
        System.out.printf("(%.2f, %.2f)\n", p1x, p1y);

        double p2x = radius * Math.cos(Math.toRadians(90));
        double p2y = radius * Math.sin(Math.toRadians(90));
        System.out.printf("(%.2f, %.2f)\n", p2x, p2y);

        double p3x = radius * Math.cos(Math.toRadians(162));
        double p3y = radius * Math.sin(Math.toRadians(162));
        System.out.printf("(%.2f, %.2f)\n", p3x, p3y);

        double p4x = radius * Math.cos(Math.toRadians(234));
        double p4y = radius * Math.sin(Math.toRadians(234));
        System.out.printf("(%.2f, %.2f)\n", p4x, p4y);

        double p5x = radius * Math.cos(Math.toRadians(306));
        double p5y = radius * Math.sin(Math.toRadians(306));
        System.out.printf("(%.2f, %.2f)\n", p5x, p5y);
    }
}
