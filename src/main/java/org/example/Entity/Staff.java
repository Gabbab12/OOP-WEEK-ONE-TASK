package org.example.Entity;

import javax.management.relation.Role;

public class Staff extends Person {
    private String level;
    private int salary;
    private String role;


    public Staff(String name, String gender, String email, String address, int age, String role) {
        super(name, gender, email, address, age);
        this.role = role;
    }

    public Staff(String name, String gender, String email, String address, int age, String level, int salary) {
        super(name, gender, email, address, age);
        this.level = level;
        this.salary = salary;
    }

    public Staff(String name, String gender, String email, String address, int age) {
        super(name, gender, email, address, age);
    }

    public Staff() {
    }

    public Staff(String jane_smith) {
    }

    ;

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "level='" + level + '\'' +
                ", salary=" + salary +
                ", role='" + role + '\'' +
                '}';
    }
}


