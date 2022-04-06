public class Main {
    public static void main(String[] args) {
        int randomNumber = (int) (Math.random() * 26 + 97);
        char character = (char) randomNumber;
        System.out.println("The generated random lowercase letter is " + character);
    }
}
