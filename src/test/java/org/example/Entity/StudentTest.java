package org.example.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    @Test
    void getDepartment() {
        Student student = new Student("Babatunde", "Male",
                "gabtunson205@yahoo.com", "Baruwa Lagos", 15, "Science","Bad");
        assertEquals("Science", student.getDepartment());
    }

    @Test
    void setDepartment() {
        Student student = new Student("Babatunde", "Male",
                "gabtunson205@yahoo.com", "Baruwa Lagos", 15, "Science","Bad");
        student.setDepartment("Commercial");
        assertEquals("Commercial", student.getDepartment());
    }
}