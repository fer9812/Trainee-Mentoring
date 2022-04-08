public class Main {
    public static void main(String[] args) {
        double tuition = 10000;
        double fourYearsWorth = 0;
        for (int i = 0; i < 14; i++) {
            tuition *= 1.06;

            if (i == 10) {
                System.out.println("");
            }
            if (i >= 11) {
                fourYearsWorth += tuition;
            }

            if (i == 0 || i == 10) {
                System.out.printf("The tuition in %2d year is $%,.3f\n", (i + 1), tuition);
            } else {
                System.out.printf("%17d year is $%,.3f\n", (i + 1), tuition);
            }
        }
        System.out.printf("The cost of four years' worth of tuition after the tenth year is $%,.3f", fourYearsWorth);

    }
}
