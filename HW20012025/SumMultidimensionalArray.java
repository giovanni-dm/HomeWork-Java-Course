package Homework.HW20012025;

public class SumMultidimensionalArray {

    public static void main(String[] args) {

        //Find the sum of the smallest and largest element in a Multidimensional Array of type int.

        int [] [] arr = {{123,456}, {789,1011}, {1234,5678}};

        int smallest = arr[0][0];
        int largest = arr[0][0];

        for(int[] w: arr){
            for(int num: w){
                if(num < smallest){
                    smallest = num;
                }
                if(num > largest){
                    largest = num;
                }
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);

    }

}
