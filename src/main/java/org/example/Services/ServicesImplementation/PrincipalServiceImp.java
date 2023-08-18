package org.example.Services.ServicesImplementation;

import org.example.Entity.Applicant;
import org.example.Entity.Student;
import org.example.Enum.Role;
import org.example.Services.PrincipalServices;

import java.security.Principal;

public class PrincipalServiceImp implements PrincipalServices {
    @Override
    public boolean admitApplicant(Applicant applicant, Role principal) {
        System.out.println(applicant.getAge());
        if (applicant.getAge() >= 18) {
            System.out.println("You can go on with your registration");
        } else {
            System.out.println("Not Eligible");
        }

        return false;

    }

    @Override
    public void expelStudent(Student student, Role principal) {
        if (student.getBehaviour() == "Bad"){
            System.out.println("You have been expelled from this School");
        }else{
            System.out.println("Good work, keep it up!!!");
        }

    }

}
