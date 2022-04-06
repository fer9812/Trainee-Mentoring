import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        System.out.print("Enter a month: ");
        String month = input.next();
        switch (month) {
            case "Feb":
                System.out.println(isLeapYear ? (month + " " + year + " has 29 days") : (month + " " + year + " has 28 days"));
            case "Jan":
            case "Mar":
            case "May":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":
                System.out.println(month + " " + year + " has 31 days");
                break;
            case "Apr":
            case "Jun":
            case "Sep":
            case "Nov":
                System.out.println(month + " " + year + " has 30 days");
                break;
            default:
                System.out.println(month + " is not a correct month name");
                break;
        }
    }
}
