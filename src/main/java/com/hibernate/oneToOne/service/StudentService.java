package com.hibernate.oneToOne.service;

import com.hibernate.oneToOne.entity.Student;

import java.util.List;

public interface StudentService {
    Student addStudent(Student student);

    List<Student> getStudent();
}
