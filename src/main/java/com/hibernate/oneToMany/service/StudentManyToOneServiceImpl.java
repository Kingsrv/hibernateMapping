package com.hibernate.oneToMany.service;

import com.hibernate.oneToMany.entity.StudentManyToOne;
import com.hibernate.oneToMany.repository.StudentManyToOneRepository;
import com.hibernate.oneToOne.entity.Student;
import com.hibernate.oneToOne.repository.StudentRepository;
import com.hibernate.oneToOne.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentManyToOneServiceImpl implements StudentManyToOneService {

    @Autowired
    private StudentManyToOneRepository studentRepository;

    @Override
    public StudentManyToOne addStudent(StudentManyToOne student) {
        return studentRepository.save(student);
    }

    @Override
    public List<StudentManyToOne> getStudent() {
        return null;
    }
}
