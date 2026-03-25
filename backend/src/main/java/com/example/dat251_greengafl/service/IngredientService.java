package com.example.dat251_greengafl.service;

import com.example.dat251_greengafl.model.Ingredient;
import com.example.dat251_greengafl.repo.IngredientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class IngredientService {

    @Autowired
    private IngredientRepo ingredientRepo;

    public List<Ingredient> findAll() {
        return ingredientRepo.findAll();
    }

    public Optional<Ingredient> findById(UUID id) {
        return ingredientRepo.findById(id);
    }

    public Optional<Ingredient> findByName(String name) {
        return ingredientRepo.findByName(name);
    }

    public Ingredient save(Ingredient ingredient) {
        return ingredientRepo.save(ingredient);
    }

    public void deleteById(UUID id) {
        ingredientRepo.deleteById(id);
    }
}
