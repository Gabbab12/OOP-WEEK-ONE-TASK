package org.example;

import org.example.Entity.Applicant;
import org.example.Entity.Person;
import org.example.Entity.Staff;
import org.example.Enum.Role;
import org.example.Model.Course;

public class Main {
    public static void main(String[] args) {

        System.out.println(Role.PRINCIPAL);

        Staff teacher = new Staff("Gabriel", "male", "gaba",
                "Abolade", 54, "300L", 50000);
        Course course = new Course("Mathmatics", "Maths 201");
        Staff Teacher = new Staff(Role.TEACHER.name(), "male", "gaba",
                "Abolade", 54, "300L", 50000);
        Staff Staff = new Staff(Role.NON_TEACHING_STAFF.name(), "male", "gaba",
                "Abolade", 54, "300L", 50000);
        Staff Principal = new Staff(Role.PRINCIPAL.name(), "male", "gaba",
                "Abolade", 54, "300L", 50000);
        Person person = new Person("Gabriel", "male", "gaba", "GB", 17);
        Applicant applicant = new Applicant("gab", "male", "ghdg", "dh", 9, "hduh",
                "09089897", "9897");

    }
}