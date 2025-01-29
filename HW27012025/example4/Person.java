package Homework.HW27012025.example4;

public class Person {

    final private String name;
    final private String age;
    final private String address;
    final private String phone_number;

    public Person(String name, String age, String address, String phone_number){
        this.name = name;
        this.age = age;
        this.address = address;
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public String getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone_number() {
        return phone_number;
    }
}
