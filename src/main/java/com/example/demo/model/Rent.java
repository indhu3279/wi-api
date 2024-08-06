package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

@Entity
public class Rent{
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long carId;
    private String origin;
    private String destination;
    private int hoursRequirement;
    private int totalPayableAmt;
    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getHoursRequirement() {
        return hoursRequirement;
    }

    public void setHoursRequirement(int hoursRequirement) {
        this.hoursRequirement = hoursRequirement;
    }

    public int getTotalPayableAmt() {
        return totalPayableAmt;
    }

    public void setTotalPayableAmt(int totalPayableAmt) {
        this.totalPayableAmt = totalPayableAmt;
    }
}
