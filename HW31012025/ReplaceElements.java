package Homework.HW31012025;
import java.util.*;

    public class ReplaceElements {
        public static void main(String[] args) {
            List<String> items = new ArrayList<>(Arrays.asList("X", "A", "B", "X", "C", "X"));

            // Implement ListIterator to modify elements

            Iterator<String> it01 = items.iterator();

            while (it01.hasNext()){
                String element = it01.next();
                if(element.equals("X")){
                    element = "Z";
                }
            }

            System.out.println(items);

        }
}


