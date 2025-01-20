package Homework;

public class CitiesExample {

    public static void main(String[] args) {
         /*

                Example 1: Create a String array, add 5 elements to it, all elements have
                    display the sum of the number of characters it contains.


                    New York: 8
                    Warsaw: 6
                    London: 6
                        Fix the below code, to have the output above.
         */
        String[] cities = {"New York", "Warsaw", "London", "Naples", "Salerno"};
        int totalChar = 0;
        for (int i=0; i<cities.length; i++){
            totalChar += cities[i].length();
            System.out.println(cities[i] + ": " + cities[i].length());
        }
        System.out.println(totalChar);


    }
}
