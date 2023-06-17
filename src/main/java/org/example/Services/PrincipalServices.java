package org.example.Services;

import org.example.Entity.Applicant;
import org.example.Entity.Student;

import java.security.Principal;

public interface PrincipalServices {
    boolean admitApplicant(Applicant applicant, Student student, Principal principal);
}
