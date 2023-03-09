package com.hibernate.oneToMany.repository;

import com.hibernate.oneToMany.entity.Address;
import com.hibernate.oneToOne.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
