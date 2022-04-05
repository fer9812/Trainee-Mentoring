import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the time zone offset to GMT: ");
        int timeZone = input.nextInt();

        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = totalSeconds % 60;
        long totalMinutes = totalSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = (totalHours + timeZone) % 24;

        String currentStr = (currentHour >= 12) ? ((currentHour - 12) + ":" + currentMinute + ":" + currentSecond + " PM") :
                ((currentHour - 12) + ":" + currentMinute + ":" + currentSecond + " AM");
        System.out.println("The current time is " + currentStr);
    }
}
