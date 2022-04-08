import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students (>2): ");
        int numberOfStudents = input.nextInt();

        double lowestScore = 0, secondLowestScore = 0, score = 0;
        String studentWithLowest = "", studentWithSecondLowest = "", studentName = "";
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Enter the student’s name and score (eg. Jack 95): ");
            studentName = input.next();
            score = input.nextDouble();

            if (i == 0) {
                lowestScore = secondLowestScore = score;
                studentWithLowest = studentWithSecondLowest = studentName;
            }

            if (score < secondLowestScore) {
                if (score < lowestScore) {
                    secondLowestScore = lowestScore;
                    studentWithSecondLowest = studentWithLowest;
                    lowestScore = score;
                    studentWithLowest = studentName;
                } else if (score == lowestScore) {
                    studentWithLowest += ", " + studentName;
                } else {
                    secondLowestScore = score;
                    studentWithSecondLowest = studentName;
                }
            } else if (score == secondLowestScore) {
                studentWithSecondLowest += ", " + studentName;
            }
        }
        System.out.println("The lowest score: " + lowestScore);
        System.out.println("The student with lowest score: " + studentWithLowest);
        System.out.println("The second lowest score: " + secondLowestScore);
        System.out.println("The student with second lowest score: " + studentWithSecondLowest);
    }
}
