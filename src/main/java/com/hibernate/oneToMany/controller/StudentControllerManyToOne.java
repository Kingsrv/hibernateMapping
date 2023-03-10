package com.hibernate.oneToMany.controller;

import com.hibernate.oneToMany.entity.StudentManyToOne;
import com.hibernate.oneToMany.service.StudentManyToOneServiceImpl;
import com.hibernate.oneToOne.entity.Student;
import com.hibernate.oneToOne.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/studentM21")
public class StudentControllerManyToOne {

    @Autowired
    private StudentManyToOneServiceImpl studentService;


    @PostMapping
    public ResponseEntity<StudentManyToOne> addStudent(@RequestBody StudentManyToOne student) {
        return ResponseEntity.status(HttpStatus.CREATED).body(studentService.addStudent(student));
    }


}
