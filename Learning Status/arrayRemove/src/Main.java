import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> starWithC = new ArrayList<String>();
        starWithC.add("C");
        starWithC.add("C++");

        ArrayList<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Perl");
        scriptingLanguages.add("Ruby");

        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("java");
        programmingLanguages.add("Kotlin");

        ArrayList<String> initialArray = new ArrayList<>();
        initialArray.addAll(starWithC);
        initialArray.addAll(programmingLanguages);
        initialArray.addAll(scriptingLanguages);
        System.out.println(initialArray); //We print the initial array

        initialArray.remove(5);
        System.out.println(initialArray); //We print the initial array without the 5 position

        initialArray.remove("Kotlin");
        System.out.println(initialArray);// we print without Kotlin

        initialArray.removeAll(scriptingLanguages);
        System.out.println(initialArray);  //We print without scripting languages

        initialArray.removeAll(starWithC);
        System.out.println(initialArray);

        initialArray.clear();
        System.out.println(initialArray);
    }
}
