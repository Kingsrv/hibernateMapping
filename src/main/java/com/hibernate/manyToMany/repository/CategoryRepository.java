package com.hibernate.manyToMany.repository;

import com.hibernate.manyToMany.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, String> {
}
