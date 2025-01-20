package Homework.HW20012025;

import java.util.Arrays;

public class MissingPositive {

    public static void main(String[] args) {
        int[] arr = {3, 4, -1, 1};
        Arrays.sort(arr);
    
        int missingPositive = 1;
        for (int num : arr) {
            if (num == missingPositive) {
                missingPositive++;
            } else if (num > missingPositive) {
                break;
            }
        }
    
        System.out.println("The first missing positive integer in the array is: " + missingPositive);
    }

}
