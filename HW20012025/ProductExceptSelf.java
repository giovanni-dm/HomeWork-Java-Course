package Homework.HW20012025;

import java.util.Arrays;

public class ProductExceptSelf {

    public static int[] productExceptSelf(int[] arr) {
        int n = arr.length;
        if (n == 0) return new int[0];

        int[] prefix = new int[n];
        int[] suffix = new int[n];
        int[] result = new int[n];

        // Initialize the first prefix and last suffix
        prefix[0] = 1;
        suffix[n - 1] = 1;

        // Build the prefix array
        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] * arr[i - 1];
        }

        // Build the suffix array
        for (int i = n - 2; i >= 0; i--) {
            suffix[i] = suffix[i + 1] * arr[i + 1];
        }

        // Build the result array
        for (int i = 0; i < n; i++) {
            result[i] = prefix[i] * suffix[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5};
        int[] input2 = {3, 2, 1};

        System.out.println(Arrays.toString(productExceptSelf(input1))); // Output: [120, 60, 40, 30, 24]
        System.out.println(Arrays.toString(productExceptSelf(input2))); // Output: [2, 3, 6]
    }
}
