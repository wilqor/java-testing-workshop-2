package com.wilqor.workshop.testing.mocking.verification;

import java.util.List;
import java.util.Objects;

/**
 * @author wilqor
 */
public class RecipeDetails {
    public static final String RECIPE_NOT_FOUND_NAME = "-not found-";

    private final String name;
    private final boolean glutenFree;
    private final List<Ingredient> ingredients;

    public RecipeDetails(String name, boolean glutenFree, List<Ingredient> ingredients) {
        this.name = name;
        this.glutenFree = glutenFree;
        this.ingredients = ingredients;
    }

    public String getName() {
        return name;
    }

    public boolean isGlutenFree() {
        return glutenFree;
    }

    public List<Ingredient> getIngredients() {
        return ingredients;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeDetails that = (RecipeDetails) o;
        return glutenFree == that.glutenFree &&
                Objects.equals(name, that.name) &&
                Objects.equals(ingredients, that.ingredients);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, glutenFree, ingredients);
    }

    @Override
    public String toString() {
        return "RecipeDetails{" +
                "name='" + name + '\'' +
                ", glutenFree=" + glutenFree +
                ", ingredients=" + ingredients +
                '}';
    }
}
