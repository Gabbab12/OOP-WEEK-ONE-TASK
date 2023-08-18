package org.example.Services;

import org.example.Entity.Applicant;
import org.example.Entity.Student;
import org.example.Enum.Role;

import java.security.Principal;

public interface PrincipalServices {

    boolean admitApplicant(Applicant applicant, Role principal);

    void expelStudent (Student student, Role principal);
}
