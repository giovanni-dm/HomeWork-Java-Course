package Homework.HW31012025;

public class TemperatureChecker {

    public static void main(String[] args) {
        validateTemperature(75);
    }

    public static void validateTemperature(int temp) {
        // Implement exception handling

        if(temp < -50 || temp > 60){
            try {
                throw new ExtremeTemperatureException("Extreme Temperature!!!");
            } catch (Exception e){
                e.printStackTrace();
            }
        }


    }

}
