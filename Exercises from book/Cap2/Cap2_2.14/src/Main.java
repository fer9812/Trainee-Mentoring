import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double kilogramsPerPound = 0.45359237;
        final double metersPerInch = 0.0254;


        System.out.print("Enter weight in pounds: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in inches: ");
        double height = input.nextDouble();

        weight = weight * kilogramsPerPound;// weight to kilograms

        height = height * metersPerInch;// height to meters
        double bodyMassIndex = weight / Math.pow(height, 2);
        System.out.println("BMI is " + bodyMassIndex);
    }
}
