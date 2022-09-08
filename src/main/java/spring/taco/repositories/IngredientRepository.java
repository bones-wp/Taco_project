package spring.taco.repositories;

import org.springframework.data.repository.CrudRepository;
import spring.taco.Ingredient;


public interface IngredientRepository extends CrudRepository<Ingredient, String> {
}
