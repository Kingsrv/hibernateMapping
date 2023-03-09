package com.hibernate.oneToMany.service;

import com.hibernate.oneToOne.entity.Student;

import java.util.List;

public interface StudentManyToOneService {
    Student addStudent(Student student);

    List<Student> getStudent();
}
