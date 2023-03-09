package com.hibernate.oneToMany.service;

import com.hibernate.oneToMany.entity.Address;
import com.hibernate.oneToOne.entity.Student;

import java.util.List;

public interface AddressService {
    Address addAddress(Address address);

    List<Address> getAddress();
}
