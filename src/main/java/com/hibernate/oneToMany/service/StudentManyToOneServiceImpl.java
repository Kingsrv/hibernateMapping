package com.hibernate.oneToMany.service;

import com.hibernate.oneToOne.entity.Student;
import com.hibernate.oneToOne.repository.StudentRepository;
import com.hibernate.oneToOne.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManyToOneServiceImpl implements StudentManyToOneService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getStudent() {
        return null;
    }
}
