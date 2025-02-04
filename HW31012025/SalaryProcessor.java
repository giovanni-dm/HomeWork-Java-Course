package Homework.HW31012025;

public class SalaryProcessor {

    public static void main(String[] args) {
        processSalary(-5000);
    }


    /*

    Modify the processSalary method so that it throws a custom checked exception NegativeSalaryException when the given salary is negative.
public class SalaryProcessor {
    public static void main(String[] args) {
        processSalary(-5000);
    }

    public static void processSalary(int salary) {
        // Implement exception handling
    }
}

     */

    public static void processSalary(int salary) {
        // Implement exception handling

        if (salary < 0){
            try {
                throw new RuntimeException("Salary can't be negative");
            }catch (InvalidSalaryException e){
                e.printStackTrace();
            }
        }

    }


}
