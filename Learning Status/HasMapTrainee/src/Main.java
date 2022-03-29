import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        HashMap values1 = new HashMap();
        values1.put("10" , "abc");
        values1.put("20" , "xyz");
        values1.put("30" , "mno");


        String obtain = values1.get("20").toString();
        System.out.println(obtain);
    }
}
