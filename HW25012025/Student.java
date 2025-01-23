package Homework.HW25012025;

public class Student {

    /*Create a Student class:
    Fields: name (String), age (int), grade (String).
    Constructor: Create a parameterized constructor to initialize the fields.
    Methods:
    study: Prints "[name] is studying."
    getDetails: Returns the student's details as a formatted String.*/

    String name;
    int age;
    String grade;

    public Student(String name, int age, String grade){

        this.name = name;
        this.age =  age;
        this.grade = grade;

    }

    public void study(){
        System.out.println(this.name + " is studying.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                '}';
    }


}
