package com.wilqor.workshop.testing.mocking.verification;

/**
 * Interface imitating a UI view layer, responsible for
 * updating parts of the interface.
 *
 * @author wilqor
 */
public interface RecipeView {
    /**
     * Clears all ingredient widgets in the panel
     */
    void clearIngredientsPanel();

    /**
     * Adds widget for given ingredient to ingredients panel.
     *
     * @param ingredient ingredient to be added
     */
    void addIngredientToPanel(Ingredient ingredient);

    /**
     * Configures display of gluten free label.
     *
     * @param visible flag describing display of gluten free label
     */
    void setGlutenFreeLabelVisible(boolean visible);

    /**
     * Sets name to be displayed for given recipe.
     *
     * @param recipeName recipe name to be displayed
     */
    void setRecipeNameText(String recipeName);
}
