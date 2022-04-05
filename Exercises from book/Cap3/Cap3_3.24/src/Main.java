public class Main {
    public static void main(String[] args) {
        int rankIndex = (int) (Math.random() * 13);
        String rankStr = "";
        int suitIndex = (int) (Math.random() * 4);
        String suitStr = "";

        switch (rankIndex) {
            case 0:
                rankStr = "Ace";
                break;
            case 10:
                rankStr = "Jack";
                break;
            case 11:
                rankStr = "Queen";
                break;
            case 12:
                rankStr = "King";
                break;
            default:
                rankStr = String.valueOf(rankIndex + 1);
        }

        switch (suitIndex) {
            case 0:
                suitStr = "Clubs";
                break;
            case 1:
                suitStr = "Diamonds";
                break;
            case 2:
                suitStr = "Hearts";
                break;
            case 3:
                suitStr = "Spades";
        }

        System.out.println("The card you picked is " + rankStr + " of " + suitStr);
    }
}
