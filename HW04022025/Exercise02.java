package Homework.HW04022025;

import java.util.Arrays;
import java.util.List;

public class Exercise02 {

    //Write a method that converts all unique elements with less than 5 characters
    //in a List<String> to lowercase letters and prints them to the console according to their natural order.

    public static void convertAndPrintUniqueElements(List<String> list) {
        // Use streams to filter, transform, and sort the elements
        list.stream()
                .filter(element -> element.length() < 5) // Filter elements with less than 5 characters
                .map(String::toLowerCase) // Convert elements to lowercase
                .distinct() // Ensure only unique elements are processed
                .sorted() // Sort elements in natural order
                .forEach(System.out::println); // Print each element
    }

    public static void main(String[] args) {
        // Example usage
        List<String> list = Arrays.asList("Apple", "banana", "Cat", "dog", "Eagle", "fish", "goat", "hat", "cat");
        convertAndPrintUniqueElements(list);
    }

}
