package Homework.HW25012025;

import java.util.Arrays;
import java.util.Comparator;

public class StringBuilderOrder {

    public static void main(String[] args) {

//        Create several StringBuilder texts, and print them in the right order.

        StringBuilder sb1 = new StringBuilder("giovanni");
        StringBuilder sb2 = new StringBuilder("Ajeesha");
        StringBuilder sb3 = new StringBuilder("Jace");

        // Create an array to store the StringBuilders
        StringBuilder[] texts = {sb1, sb2, sb3};
        Arrays.sort(texts, new Comparator<StringBuilder>() {
            @Override
            public int compare(StringBuilder a, StringBuilder b) {
                return a.toString().compareTo(b.toString());
            }
        });

        for (StringBuilder name : texts){
            System.out.println(name);
        }




    }
}
