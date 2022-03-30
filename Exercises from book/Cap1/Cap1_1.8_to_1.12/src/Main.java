public class Main {
    public static void main(String[] args) {
        //1.8
        System.out.println(" Exercise 1.8");
        double letterPi = 3.14159;
        double radius = 6.5;
        double perimeter = 2 * radius * letterPi;
        double area = radius * radius * letterPi ;
        System.out.println(perimeter);
        System.out.println(area);
        System.out.println(" ");

        //1.9
        System.out.println("Exercise 1.9");
        double width = 5.3;
        double height = 8.6;
        double areaRec = width * height;
        double perimeterRec = 2 * (width + height);
        System.out.println(areaRec);
        System.out.println(perimeterRec);
        System.out.println(" ");

        //1.10
        System.out.println("Exercise 1.10");
        double totalKilometers = 15.00;
        double miles = 1.6;
        double kilometersToMiles = totalKilometers/miles;
        System.out.println(kilometersToMiles);
        System.out.println(" ");


        //1.11
        System.out.println("Exercise 1.11");
        double birthRateInSeconds = 7.0;
        double deathRateInSeconds = 13.0;
        double newImmigrantInSeconds = 45.0;

        double currentPopulation = 312032486;

        double secondsInYears = 60 * 60 * 24 * 365;

        double numBirths = secondsInYears / birthRateInSeconds;
        double numDeaths = secondsInYears / deathRateInSeconds;
        double numImmigrants = secondsInYears / newImmigrantInSeconds;

        for (int i = 1; i <= 5; i++) {
            currentPopulation += numBirths + numImmigrants - numDeaths;
            System.out.println("Year " + i + " = " + (int) currentPopulation);
        }
        System.out.println(" ");

        //1.12
        System.out.println("Exercise 1.12");
        double totalMiles = 24.0;
        double kilometer = 1.6;
        double milesToKilometers = totalMiles * kilometer;
        System.out.println(milesToKilometers);
    }
}
