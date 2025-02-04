package Homework.HW04022025;

import java.util.List;

public class Exercise01 {

    //Write a method that prints all unique (non-repetitive) elements
    //with less than 5 characters in a List<String> to the console.

    public static void main(String[] args) {

        List<String> strings = List.of("apple", "bat", "cat", "dog", "bat", "elephant", "fox", "goat", "hat");

        printUniqueElementsWithLessThan5Chars(strings);


    }


    public static void printUniqueElementsWithLessThan5Chars(List<String> list) {
        list.stream()
                .filter(s -> s.length() < 5) // Filter elements with less than 5 characters
                .distinct() // Ensure elements are unique
                .forEach(System.out::println); // Print each unique element
    }



}
