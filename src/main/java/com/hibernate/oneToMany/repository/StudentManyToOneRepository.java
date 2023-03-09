package com.hibernate.oneToMany.repository;

import com.hibernate.oneToMany.entity.StudentManyToOne;
import com.hibernate.oneToOne.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentManyToOneRepository extends JpaRepository<StudentManyToOne, Integer> {

}
