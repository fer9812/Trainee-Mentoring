import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double RADIUS_OF_THE_EARTH = 6371.01;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();

        double greatCircleDistance = RADIUS_OF_THE_EARTH *
                Math.acos(Math.sin(Math.toRadians(x1)) * Math.sin(Math.toRadians(x2)) +
                        Math.cos(Math.toRadians(x1)) * Math.cos(Math.toRadians(x2)) *
                                Math.cos(Math.toRadians(y1 - y2)));
        System.out.println("The distance between the two points is " + greatCircleDistance + " km");

        System.out.println();
    }
}
