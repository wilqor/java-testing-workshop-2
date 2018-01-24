package com.wilqor.workshop.testing.mocking.verification;

import java.util.Optional;

/**
 * Presenter modelling a UI component, which has a view underneath
 * and uses a service to fetch data to display.
 *
 * @author wilqor
 */
public class RecipePresenter {
    private final RecipeService recipeService;
    private final RecipeView recipeView;

    public RecipePresenter(RecipeService recipeService, RecipeView recipeView) {
        this.recipeService = recipeService;
        this.recipeView = recipeView;
    }

    /**
     * Updates displayed view of the presenter, based on the details
     * of found recipe with given id.
     *
     * @param recipeId id of recipe to search for
     */
    void updateRecipeDetails(long recipeId) {
        recipeView.clearIngredientsPanel();
        Optional<RecipeDetails> recipeDetailsOptional = Optional.ofNullable(recipeService.findRecipe(recipeId));
        updateRecipeName(recipeDetailsOptional);
        updateGlutenFree(recipeDetailsOptional);
        updateIngredients(recipeDetailsOptional);
    }

    private void updateRecipeName(Optional<RecipeDetails> recipeDetailsOptional) {
        String recipeNameToDisplay = recipeDetailsOptional.map(RecipeDetails::getName).orElse(RecipeDetails.RECIPE_NOT_FOUND_NAME);
        recipeView.setRecipeNameText(recipeNameToDisplay);
    }

    private void updateGlutenFree(Optional<RecipeDetails> recipeDetailsOptional) {
        boolean glutenFree = recipeDetailsOptional.map(RecipeDetails::isGlutenFree).orElse(false);
        recipeView.setGlutenFreeLabelVisible(glutenFree);
    }

    private void updateIngredients(Optional<RecipeDetails> recipeDetailsOptional) {
        recipeDetailsOptional.ifPresent(recipeDetails -> recipeDetails.getIngredients()
                .forEach(recipeView::addIngredientToPanel));
    }
}
