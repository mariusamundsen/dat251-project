package com.example.dat251_greengafl.model;

/**
 * Represents all dietary preferences and restrictions a user can have.
 * Used to filter and recommend recipes matching a user's dietary needs.
 */
public enum DietaryPreference {

    // Dietary choices
    VEGAN,
    VEGETARIAN,
    PESCETARIAN,
    HALAL,
    KOSHER,

    // Nutritional goals
    HIGH_PROTEIN,
    LOW_CARB,
    KETO,

    // Gluten & wheat
    GLUTEN_FREE,
    WHEAT_FREE,

    // Dairy & eggs
    DAIRY_FREE,
    LACTOSE_FREE,
    EGG_FREE,

    // Nuts
    PEANUT_FREE,
    TREE_NUT_FREE,

    // Seafood
    FISH_FREE,
    SHELLFISH_FREE,

    // Other common allergens
    SOY_FREE,
    SESAME_FREE,
    MUSTARD_FREE,
    CELERY_FREE,
    LUPIN_FREE,
    MOLLUSC_FREE,
    SULPHITE_FREE
}
