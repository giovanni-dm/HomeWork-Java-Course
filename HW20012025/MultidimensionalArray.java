package Homework.HW20012025;

public class MultidimensionalArray {

    public static void main(String[] args) {

        //Turn the multi-dimentional array into a one-dimentional array:
        int[][] numbers = {{7, 8, 9}, {1}, {3, 5, 2, 4}}; // Expected output: [7, 8, 9, 1, 3, 5, 2, 4]

        int arrayLength = 0;

        for (int[] array : numbers) {
            arrayLength += array.length;
        }

        int[] oneDimensionalArray = new int[arrayLength];
        int index = 0;

        for (int[] array : numbers) {
            for (int number : array) {
                oneDimensionalArray[index++] = number;
            }

        }



    }
}
