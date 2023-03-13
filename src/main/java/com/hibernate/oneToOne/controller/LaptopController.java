package com.hibernate.oneToOne.controller;

import com.hibernate.oneToOne.entity.Laptop;
import com.hibernate.oneToOne.entity.Student;
import com.hibernate.oneToOne.service.LaptopServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/laptop")
public class LaptopController {

    @Autowired
    private LaptopServiceImpl laptopService;

    @PostMapping
    public ResponseEntity<Laptop> addLaptop(@RequestBody Laptop laptop){
        return ResponseEntity.status(HttpStatus.CREATED).body(laptopService.addLaptop(laptop));
    }

    @GetMapping
    public List<Laptop> getLaptop(){
        return laptopService.getLaptop();
    }
}
