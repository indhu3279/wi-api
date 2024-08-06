package com.example.demo.services;

import com.example.demo.model.Rent;
import com.example.demo.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RentService {
    @Autowired
    private RentRepository rentRepository;

    public Rent rentCar(Rent rent) {
        return rentRepository.save(rent);
    }
}

