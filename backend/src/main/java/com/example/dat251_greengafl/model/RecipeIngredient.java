package com.example.dat251_greengafl.model;

import jakarta.persistence.*;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "recipe_ingredient")
public class RecipeIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "recipe_id", nullable = false)
    private Recipe recipe;

    @ManyToOne(optional = false)
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    /** Free-form quantity string (e.g. "2", "1/2", "a pinch"). */
    private String quantity;

    /** Unit of measure (e.g. "cups", "grams", "tbsp"). */
    private String unit;

    public RecipeIngredient() {
    }

    public UUID getId() {
        return id;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * Returns the food-category tags derived from this ingredient's tag.
     * Used by Recipe#getCategories() to aggregate all ingredient tags.
     */
    public Set<FoodCategory> getCategories() {
        if (ingredient != null && ingredient.getTag() != null) {
            return Set.of(ingredient.getTag());
        }
        return Set.of();
    }
}
