package Homework.HW27012025.example4;

public class Main {

    public static void main(String[] args) {
        /*

        Example 4:
            You are saving person information in a company.
            You are expected to collect:
                - Name
                - Age
                - Address
                - Phone Number

            These should NOT be changeable once they are set.
            Also, you need to consider the security so they should be private.

            Find a way to implement this.

 */

        Person p1 = new Person();
        System.out.println("Name:" + p1.getName() + "\nAge:" + p1.getAge() + "\nAddress: "+p1.getAddress() + "\nPhone Number:" + p1.getPhone_number());


    }
}
