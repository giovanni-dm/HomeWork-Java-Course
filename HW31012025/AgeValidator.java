package Homework.HW31012025;



public class AgeValidator {

    /*

    Implement a custom exception InvalidAgeException that extends RuntimeException and throw it inside the validateAge(int age) method when the age is less than 0 or greater than 150.

     */

    public static void main(String[] args) {
        validateAge(200);
    }

    public static void validateAge(int age) {
        // Implement the custom exception logic here

        if(age < 0 || age > 150){
            try {
                throw new InvalidAgeException("Age is invalid.");
            } catch (InvalidAgeException e) {
                throw new RuntimeException(e);
            }

        }

    }



}
