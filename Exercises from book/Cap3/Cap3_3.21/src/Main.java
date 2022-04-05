import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int dayOfTheMonth = input.nextInt();

        int q = dayOfTheMonth;
        int m = 0;

        if (month == 1 || month == 2) {
            m = month + 12;
            year--;
        } else {
            m = month;
        }
        int j = year / 100;
        int k = year % 100;

        int h = (q + 26 * (m + 1) / 10 + k + k / 4 + j / 4 + 5 * j) % 7;
        String dayOfTheWeekStr = "";
        switch (h) {
            case 0:
                dayOfTheWeekStr = "Saturday";
                break;
            case 1:
                dayOfTheWeekStr = "Sunday";
                break;
            case 2:
                dayOfTheWeekStr = "Monday";
                break;
            case 3:
                dayOfTheWeekStr = "Tuesday";
                break;
            case 4:
                dayOfTheWeekStr = "Wednesday";
                break;
            case 5:
                dayOfTheWeekStr = "Thursday";
                break;
            case 6:
                dayOfTheWeekStr = "Friday";
                break;
        }
        System.out.println("Day of the week is " + dayOfTheWeekStr);
    }
}
