package Homework.HW27012025.example3;

public class Main {

    public static void main(String[] args) {

        /*

        Example 3:
            You are writing the fundamentals of a game.
            The game will have:
                - Car
                - Bike
            to drive.

            Both of them should be able to move, but of course the way
            they move is different.

            Find a way to implement this.

 */

        Game g1 = new Bike();
        g1.move();
        Game g2 = new Car();
        g2.move();


    }
}
