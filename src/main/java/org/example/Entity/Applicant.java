package org.example.Entity;

public class Applicant extends Person{
    private String fullName;
    private String phoneNumber;
    private String dateOfBirth;

    public Applicant(String name, String gender, String email, String address, int age, String fullName, String phoneNumber, String dateOfBirth) {
        super(name, gender, email, address, age);
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.dateOfBirth = dateOfBirth;

    }
//    public Applicant (){};

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
