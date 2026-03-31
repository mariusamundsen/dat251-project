package com.example.dat251_greengafl.repo;

import com.example.dat251_greengafl.model.RecipeIngredient;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface RecipeIngredientRepo extends JpaRepository<RecipeIngredient, UUID> {
}
