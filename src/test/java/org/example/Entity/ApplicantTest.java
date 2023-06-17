package org.example.Entity;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ApplicantTest {

    @Test
    short getFullName() {
        Applicant applicant = new Applicant("s", "male",
                "hd", "dg", 32, "gmm", "090908", "ur7y");
        assertEquals("gmm", getFullName());
        return 0;
    }

    @Test
    void setFullName() {
        Applicant applicant = new Applicant("s", "male",
                "hd", "dg", 32, "gmm", "090908", "ur7y");
        applicant.setFullName("gm");
        assertEquals("gm", applicant.getFullName());
    }

    @Test
    void getPhoneNumber() {
        Applicant applicant = new Applicant("s", "male",
                "hd", "dg", 32, "gmm", "090908", "ur7y");
        assertEquals("090908", applicant.getPhoneNumber());
    }

    @Test
    void setPhoneNumber() {
        Applicant applicant = new Applicant("s", "male",
                "hd", "dg", 32, "gmm", "090908", "ur7y");
        applicant.setPhoneNumber("87");
        assertEquals("87", applicant.getPhoneNumber());
    }

    @Test
    void getDateOfBirth() {
        Applicant applicant = new Applicant("s", "male",
                "hd", "dg", 32, "gmm", "090908", "ur7y");
        assertEquals("ur7y", applicant.getDateOfBirth());
    }

    @Test
    void setDateOfBirth() {
        Applicant applicant = new Applicant("s", "male",
                "hd", "dg", 32, "gmm", "090908", "ur7y");
        applicant.setDateOfBirth("76");
        assertEquals("76", applicant.getDateOfBirth());
    }
}