package com.hibernate.oneToOne.service;

import com.hibernate.oneToOne.entity.Laptop;
import com.hibernate.oneToOne.repository.LaptopRepository;
import com.hibernate.oneToOne.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopServiceImpl implements LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    @Override
    public Laptop addLaptop(Laptop laptop) {
        return laptopRepository.save(laptop);
    }
}
