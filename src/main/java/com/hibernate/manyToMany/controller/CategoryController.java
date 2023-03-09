package com.hibernate.manyToMany.controller;

import com.hibernate.manyToMany.entity.Category;
import com.hibernate.manyToMany.service.CategoryServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(name = "/category")
public class CategoryController {
    @Autowired
    private CategoryServiceImpl categoryService;

    @PostMapping
    public ResponseEntity<Category> addCategory(@RequestBody Category category){
        return ResponseEntity.status(HttpStatus.CREATED).body(categoryService.addCategory(category));
    }

}
