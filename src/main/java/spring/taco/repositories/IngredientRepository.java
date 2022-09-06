package spring.taco.repositories;

import spring.taco.Ingredient;

import java.util.Optional;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();

    Optional<Ingredient> findById(String id);

    Ingredient save (Ingredient ingredient);
}
