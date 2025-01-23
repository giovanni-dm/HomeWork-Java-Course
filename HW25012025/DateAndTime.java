package Homework.HW25012025;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateAndTime {

    public static void main(String[] args) {

        /*
        Example 1: Get the date info from the user.

        If the date you have received from the user is in the past,
        give the message "You have entered an invalid date".

        If the date you have received from the user is in the future, say "You can enter the time".

        */





                // Create a Scanner object for user input
                Scanner scanner = new Scanner(System.in);

                // Prompt the user to enter a date
                System.out.println("Enter a date in the format yyyy-MM-dd (e.g., 23-01-2025):");

                String input = scanner.nextLine();


                    // Parse the input date
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                    LocalDate userDate = LocalDate.parse(input, formatter);

                    // Get today's date
                    LocalDate today = LocalDate.now();

                    // Compare the entered date with today
                    if (userDate.isBefore(today)) {
                        System.out.println("You have entered an invalid date.");
                    } else if (userDate.isAfter(today)) {
                        System.out.println("You can enter the time.");
                    } else {
                        System.out.println("The entered date is today.");
                    }

                    System.out.println("------------------------------------------");







    System.out.println("Please enter the day: ");
    int enteredDay = scanner.nextInt();


        System.out.println("Please enter the month: ");
        int enteredMonth = scanner.nextInt();


        System.out.println("Please enter the year: ");
        int enteredYear = scanner.nextInt();

        // Convert to LocalDate
        LocalDate date = LocalDate.of(enteredYear, enteredMonth, enteredDay);

        // Print the result
        System.out.println("Converted LocalDate: " + date);


        // Get today's date
        LocalDate todayDate = LocalDate.now();


        // Compare the entered date with today
        if (date.isBefore(today)) {
            System.out.println("You have entered an invalid date.");
        } else if (date.isAfter(today)) {
            System.out.println("You can enter the time.");
        } else {
            System.out.println("The entered date is today.");
        }

        System.out.println("------------------------------------------");



    }




}










