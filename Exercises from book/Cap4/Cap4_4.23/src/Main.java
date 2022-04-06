import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter employee’s name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hoursWorked = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPayRate = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federalTaxWithholdingRate = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double stateTaxWithholdingRate = input.nextDouble();

        System.out.println("Employee Name: " + name);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Pay Rate: $" + hourlyPayRate);
        double grossPay = hoursWorked * hourlyPayRate;
        System.out.println("Gross Pay: $" + grossPay);
        System.out.println("Deductions:");
        System.out.println("  Federal Withholding (" + federalTaxWithholdingRate * 100 + "%): "
                + grossPay * federalTaxWithholdingRate);
        System.out.println("  State Withholding (" + stateTaxWithholdingRate * 100 + "%): "
                + grossPay * stateTaxWithholdingRate);
        System.out.println("  Total Deduction: $" + grossPay * (federalTaxWithholdingRate + stateTaxWithholdingRate));
        System.out.println("Net Pay: $" + grossPay * (1 - federalTaxWithholdingRate - stateTaxWithholdingRate));
    }
}
