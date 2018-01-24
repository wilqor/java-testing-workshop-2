package com.wilqor.workshop.testing.mocking.verification;

/**
 * Service providing information about recipes.
 *
 * @author wilqor
 */
public interface RecipeService {
    /**
     * Attempts to find recipe details by its id.
     *
     * @param recipeId id of recipe to find
     * @return recipe details if found or else null
     */
    RecipeDetails findRecipe(long recipeId);
}
