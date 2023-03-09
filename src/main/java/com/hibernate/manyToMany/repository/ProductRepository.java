package com.hibernate.manyToMany.repository;

import com.hibernate.manyToMany.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
