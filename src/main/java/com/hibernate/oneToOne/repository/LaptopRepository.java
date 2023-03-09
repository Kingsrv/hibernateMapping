package com.hibernate.oneToOne.repository;

import com.hibernate.oneToOne.entity.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LaptopRepository extends JpaRepository<Laptop, Integer> {
}
