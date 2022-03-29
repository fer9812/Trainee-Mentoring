import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        String wordToEvaluate;
        boolean palindromeStatement = false;




        System.out.println("Please write your word to evaluate: ");
        Scanner wordInput = new Scanner(System.in);
        wordToEvaluate = wordInput.nextLine();
        int lengthOfWord = wordToEvaluate.length();
        String word = wordToEvaluate.toLowerCase();

        for (int i = 0 , j = lengthOfWord - 1  ; i<=j ; i++ , j--){
            if(word.charAt(i) != word.charAt(j)){
             palindromeStatement = false;
             break;
            }else{
             palindromeStatement = true;
            }

        }
        System.out.println(palindromeStatement);
    }
}
