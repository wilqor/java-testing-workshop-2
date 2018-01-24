package com.wilqor.workshop.testing.mocking.verification;

import java.util.Objects;

/**
 * @author wilqor
 */
public class Ingredient {
    private final String name;
    private final float amountInGrams;

    public Ingredient(String name, float amountInGrams) {
        this.name = name;
        this.amountInGrams = amountInGrams;
    }

    public String getName() {
        return name;
    }

    public float getAmountInGrams() {
        return amountInGrams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return Float.compare(that.amountInGrams, amountInGrams) == 0 &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, amountInGrams);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "name='" + name + '\'' +
                ", amountInGrams=" + amountInGrams +
                '}';
    }
}
