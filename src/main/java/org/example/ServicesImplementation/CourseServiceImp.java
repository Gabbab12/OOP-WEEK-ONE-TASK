package org.example.ServicesImplementation;

import org.example.Entity.Student;
import org.example.Model.Course;
import org.example.Services.CourseService;

import javax.management.relation.Role;

public abstract class CourseServiceImp implements CourseService {


    @Override
    public String takeCourse() {
        if (Student.getDepartment() == "Science"){
            System.out.println("You can go in to the class to take the course");
        }else
            System.out.println("Look for your department around the school to get your teacher");

        if (Course.getCourseName() != "Mathematics") {
            System.out.println("go to the next class for furthermath");
        } else {
            System.out.println("You are eligible to sit down for this course");
        }
        return null;
    }

    public abstract String takeCourse(Student student, Role teacher);

    public abstract String takeCourse(Course course, Role teacher);
}
