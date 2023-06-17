package org.example.Model;

import org.example.Entity.Staff;

public class School {

    private String principal;
    private String teachers;
    private String nonTeachingStaff;

    public School(Staff principal, Staff teachers, Staff nonTeachingStaff) {
        this.principal = String.valueOf(principal);
        this.teachers = String.valueOf(teachers);
        this.nonTeachingStaff = String.valueOf(nonTeachingStaff);
    }

    public School(String principal, String teachers, String nonTeachingStaff) {

    }

    public String getPrincipal() {
        return principal;
    }

    public void setPrincipal(String principal) {
        principal = principal;
    }

    public String getTeachers() {
        return teachers;
    }

    public void setTeachers(String teachers) {
        teachers = teachers;
    }

    public String getNonTeachingStaff() {
        return nonTeachingStaff;
    }

    public void setNonTeachingStaff(String nonTeachingStaff) {
        nonTeachingStaff = nonTeachingStaff;
    }
}
