package com.hibernate.manyToMany.controller;

import com.hibernate.manyToMany.entity.Product;
import com.hibernate.manyToMany.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;


    @PostMapping
    public ResponseEntity<Product> addProduct(@RequestBody Product product){
        return ResponseEntity.status(HttpStatus.CREATED).body(productService.addProduct(product));
    }
}
