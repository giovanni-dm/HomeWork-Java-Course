package Homework.HW31012025;

import java.util.*;

public class IteratorExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Tom", "Jerry", "Spike", "Butch"));

        // Use an Iterator to safely remove elements
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()) {
            String name = iterator.next();
            if (name.startsWith("S")) {
                iterator.remove();  // Safely remove the current element
            }
        }

        System.out.println(names);
    }
}