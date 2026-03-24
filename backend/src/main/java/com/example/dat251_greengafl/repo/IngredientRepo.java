package com.example.dat251_greengafl.repo;

import com.example.dat251_greengafl.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;
import java.util.UUID;

public interface IngredientRepo extends JpaRepository<Ingredient, UUID> {
    Optional<Ingredient> findByName(String name);
}
