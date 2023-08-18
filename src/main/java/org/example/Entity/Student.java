package org.example.Entity;

public class Student extends Person{
    public static String department;
    public static String behaviour;

    public Student(String name, String gender, String email, String address, int age, String department, String behaviour) {
        super(name, gender, email, address, age);
        this.department = department;
        this.behaviour = behaviour;
    }

    public Student() {
    }

    public static String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public static String getBehaviour() {
        return behaviour;
    }

    public static void setBehaviour(String behaviour) {
        Student.behaviour = behaviour;
    }
}
