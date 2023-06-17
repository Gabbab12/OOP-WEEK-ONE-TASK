package org.example.Model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void getPrincipal() {
        School school = new School("principal", "teachers", "nonTeachingStaff");
        assertEquals("principal", school.getPrincipal());
    }

    @Test
    void setPrincipal() {
        School school = new School("principal", "teachers", "nonTeachingStaff");
        school.setPrincipal("Joseph");
        assertEquals("Joseph", school.getPrincipal());
    }

    @Test
    void getTeachers() {
        School school = new School("principal", "teachers", "nonTeachingStaff");
        assertEquals("principal", school.getTeachers());
    }

    @Test
    void setTeachers() {
        School school = new School("principal", "teachers", "nonTeachingStaff");
        school.setTeachers("Jo");
        assertEquals("Jo", school.getTeachers());
    }

    @Test
    void getNonTeachingStaff() {
        School school = new School("principal", "teachers", "nonTeachingStaff");
        assertEquals("nonTeachingStaff", school.getNonTeachingStaff());
    }

    @Test
    void setNonTeachingStaff() {
        School school = new School("principal", "teachers", "nonTeachingStaff");
        school.setNonTeachingStaff("Jos");
        assertEquals("Jos", school.getNonTeachingStaff());
    }
}