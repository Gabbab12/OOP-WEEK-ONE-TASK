package org.example.Entity;

public class Person {
    private static String name;
    private static String gender;
    private static String email;
    private static String address;
    private static int age;

    public Person(String name, String gender, String email, String address, int age) {
        this.name = name;
        this.gender = gender;
        this.email = email;
        this.address = address;
        this.age = age;
    }

    public Person() {
    }


//    public Person() {}

    public static String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public static String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public static int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
