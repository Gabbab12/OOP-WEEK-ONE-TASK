package org.example.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StaffTest {

    @Test
    void getLevel() {
        Staff staff = new Staff("TEACHER", "male", "gab", "gd",12, "300l", 5000);
        assertEquals("300l", staff.getLevel());
    }

    @Test
    void setLevel() {
        Staff staff = new Staff("TEACHER", "male", "gab", "gd",12, "300l", 5000);
        staff.setLevel("400l");
        assertEquals("400l", staff.getLevel());

    }

    @Test
    void getSalary() {
        Staff staff = new Staff("TEACHER", "male", "gab", "gd",12, "300l", 5000);
        assertEquals(5000, staff.getSalary());
    }

    @Test
    void setSalary() {
        Staff staff = new Staff("TEACHER", "male", "gab", "gd",12, "300l", 5000);
        staff.setSalary(6000);
        assertEquals(6000, staff.getSalary());
    }

    @Test
    void getRole() {
        Staff staff = new Staff("jane_smith");
        assertEquals("null", staff.getRole());
    }

    @Test
    void setRole() {
       Staff staff = new Staff("jane_smith");
       staff.setRole("Jacob");
       assertEquals("Jacob", staff.getRole());
    }
}