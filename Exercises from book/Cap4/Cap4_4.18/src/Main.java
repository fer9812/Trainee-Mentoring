import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String chars = input.next();
        char major = chars.charAt(0);
        char grade = chars.charAt(1);

        String majorName = "", gradeName = "";
        boolean isValid = true;
        switch (major) {
            case 'I':
                majorName = "Information Management";
                break;
            case 'C':
                majorName = "Computer Science";
                break;
            case 'A':
                majorName = "Accounting";
                break;
            default:
                isValid = false;
                break;
        }
        if (isValid != false) {
            switch (grade) {
                case '1':
                    gradeName = "Freshman";
                    break;
                case '2':
                    gradeName = "Sophomore";
                    break;
                case '3':
                    gradeName = "Junior";
                    break;
                case '4':
                    gradeName = "Senior";
                    break;
                default:
                    isValid = false;
                    break;
            }
        }
        if (isValid == false) {
            System.out.println("Invalid input");
        } else {
            System.out.println(majorName + " " + gradeName);
        }
    }
}
