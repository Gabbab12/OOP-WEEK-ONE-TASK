package org.example.Services;

import org.example.Entity.Student;
import org.example.Enum.Role;
import org.example.Model.Course;

public interface CourseService {
    void takeCourse(Course course, Role teacher);


//    void takeCourse(Course course, javax.management.relation.Role teacher);
}
