package com.hibernate.oneToMany.service;

import com.hibernate.oneToMany.entity.StudentManyToOne;
import com.hibernate.oneToOne.entity.Student;

import java.util.List;

public interface StudentManyToOneService {
    StudentManyToOne addStudent(StudentManyToOne student);

    List<StudentManyToOne> getStudent();
}
