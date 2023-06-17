package org.example.ServicesImplementation;

import org.example.Entity.Applicant;
import org.example.Entity.Student;
import org.example.Services.PrincipalServices;

import java.security.Principal;

public class PrincipalServiceImp implements PrincipalServices {
    @Override
    public boolean admitApplicant(Applicant applicant, Student student, Principal principal) {
        if (applicant.getAge() >= 18) {
            System.out.println("You can go on with your registration");
        } else System.out.println("Not Eligible");
        return false;
    }
}
