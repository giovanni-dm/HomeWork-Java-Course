package Homework.HW04022025;

import java.util.ArrayList;
import java.util.List;

public class Exercise03 {

    public static void main(String[] args) {
        List<String> items = new ArrayList<>();
        items.add("Zebra");
        items.add("Apple");
        items.add("Leaf");
        items.add("Zeus");
        items.add("Roof");
        items.add("Ball");

        System.out.println("Before: " + items);

        removeElements(items);

        System.out.println("After: " + items);
    }

    public static void removeElements(List<String> list) {
        list.removeIf(str -> str.startsWith("Z") || str.endsWith("f"));
    }


}
