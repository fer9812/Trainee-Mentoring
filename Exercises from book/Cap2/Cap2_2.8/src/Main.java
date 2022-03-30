import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int offset = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis(); // milliseconds since midnight, Jan 1, 1970
        long totalSeconds = totalMilliseconds / 1000;// total seconds since midnight, Jan 1, 1970
        long currentSecond = totalSeconds % 60; // Compute the current second in the minute in the hour
        long totalMinutes = totalSeconds / 60;// Obtain the total minutes
        long currentMinute = totalMinutes % 60;// Compute the current minute in the hour
        long totalHours = totalMinutes / 60;// Obtain the total hours

        long currentHour = totalHours % 24;  // current hour
        currentHour = currentHour + offset;
        System.out.println("Current time is " + currentHour + ":" + currentMinute + ":" + currentSecond);
    }
}
