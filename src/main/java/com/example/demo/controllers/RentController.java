//package com.example.demo.controllers;
//
//
//import com.example.demo.model.Car;
//import com.example.demo.model.Rent;
//import com.example.demo.services.CarService;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/car")
//public class RentController {
//    @PostMapping("/rent")
//    public ResponseEntity<?> rentCar(@RequestBody RentRequest rentRequest, @RequestHeader("Authorization") String token) {
////        Long userId = jwtUtil.getUserIdFromToken(token.substring(7));
//        Optional<Car> carOpt;
//        carOpt = CarService.getCarById(rentRequest.getCarId());
//        if (carOpt.isPresent()) {
//            Rent rent = new Rent();
//            rent.setUserId(userId);
//            rent.setCarId(rentRequest.getCarId());
//            rent.setOrigin(rentRequest.getOrigin());
//            rent.setDestination(rentRequest.getDestination());
//            rent.setHoursRequirement(rentRequest.getHoursRequirement());
//            rent.setTotalPayableAmt(rentRequest.getHoursRequirement() * carOpt.get().getRentPerHour());
//            Rent newRent = rentService.rentCar(rent);
//            return ResponseEntity.ok(new RentResponse("Car rented successfully", 200, newRent.getId(), newRent.getTotalPayableAmt()));
//        }
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ApiResponse("No car is available at the moment", 400, null));
//    }
//}
