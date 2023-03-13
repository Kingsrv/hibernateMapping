package com.hibernate.oneToOne.service;

import com.hibernate.oneToOne.entity.Laptop;

import java.util.List;

public interface LaptopService {

    Laptop addLaptop(Laptop laptop);

    List<Laptop> getLaptop();
}
