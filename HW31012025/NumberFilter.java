package Homework.HW31012025;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class NumberFilter {


    //Write a Java program that uses an Iterator to remove all numbers less than 50 from an ArrayList<Integer>.


    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(10, 45, 60, 32, 80, 99));

        // Implement iterator-based removal

        Iterator<Integer> it01 = numbers.iterator();

        while(it01.hasNext()){
            Integer element = it01.next();
            if(element < 50){
                it01.remove();
            }
        }
    System.out.println(numbers);
    }
}
