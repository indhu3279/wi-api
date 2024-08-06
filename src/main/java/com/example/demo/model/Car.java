package com.example.demo.model;


import jakarta.persistence.*;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Car {

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String category;
    private String model;
    private String numberPlate;
    private String currentCity;
    private int rentPerHour;
    @ElementCollection
    private List<RentHistory> rentHistory = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getCurrentCity() {
        return currentCity;
    }

    public void setCurrentCity(String currentCity) {
        this.currentCity = currentCity;
    }

    public int getRentPerHour() {
        return rentPerHour;
    }

    public void setRentPerHour(int rentPerHour) {
        this.rentPerHour = rentPerHour;
    }

    public List<RentHistory> getRentHistory() {
        return rentHistory;
    }

    public void setRentHistory(List<RentHistory> rentHistory) {
        this.rentHistory = rentHistory;
    }
}




