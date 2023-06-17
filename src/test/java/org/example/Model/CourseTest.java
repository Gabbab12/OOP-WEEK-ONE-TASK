package org.example.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CourseTest {

    @Test
    void getCourseName() {
        Course course = new Course("Mathematics", "maths 201");
        assertEquals("Mathematics", course.getCourseName());
    }

    @Test
    void setCourseName() {
        Course course = new Course("Mathematics", "maths 201");
        course.setCourseName("English");
        assertEquals("English", course.getCourseName());

    }

    @Test
    void getCourseCode() {
        Course course = new Course("Mathematics", "maths 201");
        assertEquals("maths 201", course.getCourseCode());
    }

    @Test
    void setCourseCode() {
        Course course = new Course("Mathematics", "maths 201");
        course.setCourseCode("Eng 201");
        assertEquals("Eng 201", course.getCourseCode());
    }
}