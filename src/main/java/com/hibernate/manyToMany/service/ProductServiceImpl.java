package com.hibernate.manyToMany.service;

import com.hibernate.manyToMany.entity.Product;
import com.hibernate.manyToMany.repository.ProductRepository;
import com.hibernate.manyToMany.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }
}
