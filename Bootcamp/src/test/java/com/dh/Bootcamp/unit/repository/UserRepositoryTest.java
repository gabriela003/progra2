package com.dh.Bootcamp.unit.repository;

import com.dh.Bootcamp.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Optional;

public class UserRepositoryTest {

    UserRepository userRepository = new UserRepository();

    /*IngredientRepository repo = new IngredientRepositoryImpl();

    @Test
        //@DisplayName("Nuevo nombre del test")
    void withIngredientNameValidThenFoundIngredient(){
        // Arrange
        String ingredientName = "Aceitunas negras";
        IngredientDTO expected = new IngredientDTO("Aceitunas negras", 349);

        // Act
        Optional<IngredientDTO> current = repo.findIngredientByName(ingredientName);

        // Assert
        Assertions.assertEquals(expected, current.get());
    }

    @Test
        //@DisplayName("Nuevo nombre del test")
    void withIngredientNameValidThenFoundIngredient2(){
        // Arrange
        String ingredientName = "Aceitunas negras";
        // lo que yo espero que pase u obtener
        IngredientDTO expected = new IngredientDTO("Aceitunas negras", 349);

        // Act
        Optional<IngredientDTO> current = repo.findIngredientByName(ingredientName);

        // Assert - nuevo assertion
        Assertions.assertAll(
                () -> Assertions.assertEquals(expected.getName(), current.get().getName()),
                () -> Assertions.assertEquals(expected.getCalories(), current.get().getCalories()),
                () -> Assertions.assertEquals(expected.getWeight(), current.get().getWeight())
        );
    }

    @Test
    void NotFound(){
        // Arrange
        String ingredientName = "NOT FOUND";

        // Act
        Optional<IngredientDTO> current = repo.findIngredientByName(ingredientName);

        // Assert
        Assertions.assertTrue(current.isEmpty());
    }*/
}
