package Homework.HW25012025;


public class Power {

    public static void main(String[] args) {

    //Create a method named power that calculates the power of a number (e.g., power(2, 3) should return 8

        Power a = new Power();

       int result = a.power(2,3);
       System.out.println(result);


    }

    public int power(int number, int power){


        int result = 1;
        for (int i = 0; i < power; i++) {
            result *= number;
        }
        return result;
    }


}











