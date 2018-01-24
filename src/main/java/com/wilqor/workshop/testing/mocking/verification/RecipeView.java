package com.wilqor.workshop.testing.mocking.verification;

/**
 * Interface imitating a UI view layer, responsible for
 * updating the UI.
 *
 * @author wilqor
 */
public interface RecipeView {
    void clearIngredientsPanel();

    void addIngredientToPanel(Ingredient ingredient);

    void setGlutenFreeLabelVisible(boolean visible);

    void setRecipeNameText(String recipeName);
}
