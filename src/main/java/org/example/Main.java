package org.example;

import org.example.Entity.Applicant;
import org.example.Entity.Person;
import org.example.Entity.Staff;
import org.example.Entity.Student;
import org.example.Enum.Role;
import org.example.Model.Course;
import org.example.Services.ServicesImplementation.CourseServiceImp;
import org.example.Services.ServicesImplementation.PrincipalServiceImp;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

//        System.out.println(Role.PRINCIPAL);

        // read student data
        //List<T> list = reader.read();

        List<Staff> staffList = new ArrayList<>();


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
        Applicant applicant = new Applicant("gab", "male", "ghdg", "dh", 19, "hduh",
                "09089897", "9897");
        Student student = new Student("Jane", "Male", "Gabbab.com", "Babangida", 17, "Science","Good");


        PrincipalServiceImp principalServiceImp = new PrincipalServiceImp();
        System.out.println("************* Applicant Result ************");
        principalServiceImp.admitApplicant(applicant, Role.PRINCIPAL);

        System.out.println("************** Student's Report, based on his behaviour ******************");
        principalServiceImp.expelStudent(student, Role.PRINCIPAL);

        CourseServiceImp courseServiceImp = new CourseServiceImp();
        System.out.println("************** Teacher's comment based on the course taken ******************");
        courseServiceImp.takeCourse(course, Role.TEACHER);


    }
}