package Homework.HW04022025;

import java.util.function.Function;

public class Exercise05 {
    public static void main(String[] args) {
        // Define a lambda function to calculate factorial
        Function<Integer, Integer> factorial = n -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };


        int number = 5;
        int result = factorial.apply(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }
}