package com.example.dat251_greengafl.model;

import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false)
    private String name;

    /** Optional category tag (e.g. DAIRY for milk, MEAT for chicken). */
    @Enumerated(EnumType.STRING)
    private FoodCategory tag;

    public Ingredient() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodCategory getTag() {
        return tag;
    }

    public void setTag(FoodCategory tag) {
        this.tag = tag;
    }
}
