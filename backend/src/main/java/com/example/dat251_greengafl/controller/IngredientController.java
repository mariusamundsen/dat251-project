package com.example.dat251_greengafl.controller;

import com.example.dat251_greengafl.entities.IngredientEntity;
import com.example.dat251_greengafl.model.Ingredient;
import com.example.dat251_greengafl.service.IngredientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/ingredient")
public class IngredientController {

    @Autowired
    private IngredientService ingredientService;

    @GetMapping
    public List<Ingredient> findAll() {
        return ingredientService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Ingredient> findById(@PathVariable UUID id) {
        return ingredientService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public Ingredient create(@RequestBody IngredientEntity body) {
        Ingredient ingredient = new Ingredient();
        ingredient.setName(body.name());
        ingredient.setTag(body.tag());
        return ingredientService.save(ingredient);
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable UUID id) {
        ingredientService.deleteById(id);
    }
}
