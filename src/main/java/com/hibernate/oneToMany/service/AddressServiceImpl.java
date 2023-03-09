package com.hibernate.oneToMany.service;

import com.hibernate.oneToMany.entity.Address;
import com.hibernate.oneToMany.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address addAddress(Address address) {
        return addressRepository.save(address);
    }

    @Override
    public List<Address> getAddress() {
        return null;
    }
}
