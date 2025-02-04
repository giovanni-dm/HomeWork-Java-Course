package Homework.HW31012025;

public class SeasonChecker {

    public static void main(String[] args) {
        checkSeason(Season.SUMMER);
    }

    public static void checkSeason(Season season) {
        // Implement switch case

        switch (season) {
            case Season.SUMMER:
                System.out.println("It's summer time");
                break;
            case Season.WINTER:
                System.out.println("Winter is here.");
                break;
            default:
                System.out.println("Enjoy the mild weather");
                break;
        }
    }
}
