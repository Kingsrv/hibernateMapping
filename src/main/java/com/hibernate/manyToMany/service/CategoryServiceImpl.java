package com.hibernate.manyToMany.service;

import com.hibernate.manyToMany.entity.Category;
import com.hibernate.manyToMany.entity.Product;
import com.hibernate.manyToMany.repository.CategoryRepository;
import com.hibernate.manyToMany.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {

//        Product p1 = new Product();
//        p1.setPId("pid1");
//        p1.setProductName("Samsung");
//
//        Product p2 = new Product();
//        p2.setPId("pid1");
//        p2.setProductName("Samsung");
//
//        List<Product> categoryWiseProduct = category.getProductList();
//        categoryWiseProduct.add(p1);
//        categoryWiseProduct.add(p2);

        return categoryRepository.save(category);
    }
}
