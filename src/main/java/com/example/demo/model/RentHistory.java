package com.example.demo.model;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;

@Embeddable
public class RentHistory {
    @EmbeddedId
    private String origin;
    private String destination;
    private int amount;
    // Getters and Setters
}
