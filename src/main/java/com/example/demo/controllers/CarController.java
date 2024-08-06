package com.example.demo.controllers;


import com.example.demo.model.ApiResponse;
import com.example.demo.model.Car;
import com.example.demo.services.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/car")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping("/create")
    public ResponseEntity addCar(@RequestBody Car car){
        Car newCar = carService.addCar(car);
        return ResponseEntity.ok(new ApiResponse("Car added successfully", 200, newCar.getId()));
    }
    @GetMapping("/get-rides")
    public ResponseEntity<?> getAvailableRides(@RequestParam String origin, @RequestParam String destination, @RequestParam String category, @RequestParam int requiredHours) {
        List<Car> cars = carService.getAvailableRides(origin, category);
        return ResponseEntity.ok(cars);
    }

}
