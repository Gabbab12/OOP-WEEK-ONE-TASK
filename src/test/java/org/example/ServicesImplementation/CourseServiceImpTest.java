package org.example.ServicesImplementation;

import org.example.Entity.Student;
import org.example.Model.Course;
import org.junit.jupiter.api.Test;

import javax.management.relation.Role;

class CourseServiceImpTest {

    @Test
    void takeCourse() {
        CourseServiceImp courseServiceImp = new CourseServiceImp() {
            @Override
            public String takeCourse(Course course, org.example.Enum.Role teacher) {
                return null;
            }

            @Override
            public String takeCourse(Student student, Role teacher) {
                return null;
            }

            @Override
            public String takeCourse(Course course, Role teacher) {
                return null;
            }
            };
    }

    @Test
    public void testTakeCourse() {
    }
}