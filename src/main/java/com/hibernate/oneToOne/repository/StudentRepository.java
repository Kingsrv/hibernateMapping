package com.hibernate.oneToOne.repository;

import com.hibernate.oneToOne.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
