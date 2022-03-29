import java.util.HashMap;
import java.util.Scanner;

public class example {
    public static void main(String[] args) {
        HashMap example = new HashMap<>(3);
        example.put("abc" , "10" );
        example.put("xyz" , "20");
        example.put("mno" , "30");

        System.out.println("Please write a key: ");
        Scanner input = new Scanner(System.in);
        String value = input.nextLine();

        String value2 = example.get(value).toString();
        System.out.println(value2);
    }
}
