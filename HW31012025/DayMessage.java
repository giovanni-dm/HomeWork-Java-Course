package Homework.HW31012025;

public class DayMessage {

    public static void printMessage(Days day) {
        switch (day) {
            case MONDAY:
                System.out.println("It's Monday! Start of a new week.");
                break;
            case FRIDAY:
                System.out.println("It's Friday! Almost the weekend.");
                break;
            case SUNDAY:
                System.out.println("It's Sunday! Relax and recharge.");
                break;
            default:
                System.out.println("Regular day.");
                break;
        }
    }

    // Main method to test the printMessage method
    public static void main(String[] args) {
        printMessage(Days.MONDAY);    // Output: It's Monday! Start of a new week.
        printMessage(Days.FRIDAY);    // Output: It's Friday! Almost the weekend.
        printMessage(Days.SUNDAY);    // Output: It's Sunday! Relax and recharge.
        printMessage(Days.TUESDAY);   // Output: Regular day.
    }

}
