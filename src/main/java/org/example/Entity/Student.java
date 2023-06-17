package org.example.Entity;

public class Student extends Person{
    public static String department;

    public Student(String name, String gender, String email, String address, int age, String department) {
        super(name, gender, email, address, age);
        this.department = department;
    }

    public static String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
