import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //2.1
        System.out.println("Exercise 2.1");
        double miles;
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter miles:");
        miles = in.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println(kilometers + " Kilometers");
        System.out.println(" ");

        //2.2
        System.out.println("Exercise 2.2");
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of your triangle: ");
        double lengthOfSides = input.nextDouble();
        double areaOfTriangle = lengthOfSides * lengthOfSides * Math.sqrt(3) / 4;
        double volumeOfTriangle = areaOfTriangle * lengthOfSides;

        System.out.println("The triangle has an area of " + areaOfTriangle + "and a volume of " + volumeOfTriangle);

        //2.3
        System.out.println("Exercise 2.3");
        Scanner input1 = new Scanner(System.in);
        final double metersPerFoot = 0.305;

        System.out.print("Enter a value for feet: ");
        double feet = input1.nextDouble();

        double meters = feet * metersPerFoot;

        System.out.println(feet + " feet is " + meters + " meters");

        //2.4
        System.out.println("Exercise 2.4");
        Scanner input2 = new Scanner(System.in);
        System.out.print("Enter a number in square meters: ");
        double square_meters = input2.nextDouble();
        double ping = square_meters * 0.3025;
        System.out.println(square_meters + " square meters is " + ping + " pings");
        System.out.println(" ");
    }
}
