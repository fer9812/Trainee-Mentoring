import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String wordToEvaluate;
        String invert = "";

        System.out.println("Please write your word to change the order to reverse: ");
        Scanner wordInput = new Scanner(System.in);
        wordToEvaluate = wordInput.nextLine();
        String word = wordToEvaluate.toLowerCase();

        for ( int i = word.length() - 1 ; i >= 0 ; i-- ){
            invert += word.charAt(i);
        }
        System.out.println(invert);
    }
}
