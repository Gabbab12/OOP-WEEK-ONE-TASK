package org.example.Services;

import org.example.Enum.Role;
import org.example.Model.Course;

public interface CourseService {
    String takeCourse (Course course, Role teacher);

    String takeCourse();
}
