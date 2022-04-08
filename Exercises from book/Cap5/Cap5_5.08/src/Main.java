import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        double highestScore = 0, score = 0;
        String studentWithHighest = "", studentName = "";
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the student’s name and score (eg. Jack 95): ");
            studentName = input.next();
            score = input.nextDouble();

            if (i == 0) {
                highestScore = score;
                studentWithHighest = studentName;
            }

            if (score > highestScore) {
                highestScore = score;
                studentWithHighest = studentName;
            } else if (score == highestScore) {
                studentWithHighest += ", " + studentName;
            }
        }
        System.out.println("The highest score: " + highestScore);
        System.out.println("The student with highest score: " + studentWithHighest);
    }
}
