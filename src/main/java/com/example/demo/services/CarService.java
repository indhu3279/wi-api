package com.example.demo.services;

import com.example.demo.model.Car;
import com.example.demo.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public Car addCar(Car car) {
        return carRepository.save(car);
    }

    public List<Car> getAvailableRides(String currentCity, String category) {
        return carRepository.findByCurrentCityAndCategory(currentCity, category);
    }

    public Optional<Car> getCarById(Long id){
        return carRepository.findById(id);
    }
}

