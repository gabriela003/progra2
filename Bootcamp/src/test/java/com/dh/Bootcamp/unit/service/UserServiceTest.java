package com.dh.Bootcamp.unit.service;

import com.dh.Bootcamp.repository.UserRepository;
import com.dh.Bootcamp.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@ExtendWith(MockitoExtension.class)
public class UserServiceTest {

    @Mock
    UserRepository userRepository;

    @InjectMocks
    UserService userService;

    @Test
    void demoDonothing(){
        Mockito.doNothing().when(userRepository).doNothing();
        Assertions.assertDoesNotThrow(() -> userService.demoNoting());
    }

   /* //mock
    @Mock
    IngredientRepository repo;

    //lo que quiero testear
    @InjectMocks
    DishServiceImpl service;

    @Test
    void DishWithoutIngredientThenCalories0() {
        // Arrange
        String dishName = "aksjhd";
        List<IngredientDTO> ingredients = new ArrayList<>();
        DishDTO dish = new DishDTO();
        dish.setIngredients(ingredients);
        dish.setName(dishName);

        Integer expect = 0;

        // Act
        DishResponseDTO current = service.calculateCalories(dish);

        // Assert
        Assertions.assertEquals(expect, current.getCalories());
    }

    @Test
    void DishWithoutIngredientThenCalories523() {
        // Arrange
        String dishName = "aksjhd";
        List<IngredientDTO> ingredients = new ArrayList<>();
        IngredientDTO ingredient = new IngredientDTO("NOT FOUND", 349);
        ingredient.setWeight(150);
        ingredients.add(ingredient);
        DishDTO dish = new DishDTO();
        dish.setIngredients(ingredients);
        dish.setName(dishName);

        Integer expect = 523;

        // Mocks
        IngredientDTO ingredientMock = new IngredientDTO("NOT FOUND", 349);
        Mockito.when(repo.findIngredientByName(ingredient.getName())).thenReturn(Optional.of(ingredientMock));

        // Act
        DishResponseDTO current = service.calculateCalories(dish);

        // Assert & verificar uso de mocks
        Mockito.verify(repo, Mockito.atLeastOnce()).findIngredientByName(Mockito.anyString());
        //Mockito.verify(repo, Mockito.atLeast(3)).findIngredientByName(ingredient.getName());
        Assertions.assertEquals(expect, current.getCalories());
    }

    @Test
    void DishWithoutIngredientThenCaloriesError() {
        // Arrange
        String dishName = "New Dish";
        IngredientDTO ingredient = new IngredientDTO("NOT FOUND", 349, 150);
        List<IngredientDTO> ingredients = new ArrayList<>();
        ingredients.add(ingredient);
        DishDTO dish = new DishDTO(dishName, ingredients);

        // Mocks
        Mockito.when(repo.findIngredientByName(ingredient.getName())).thenReturn(Optional.empty());

        // Act & Assert
        Assertions.assertThrows(IngredientNotFoundException.class, () -> service.calculateCalories(dish));
        Mockito.verify(repo, Mockito.times(1)).findIngredientByName(Mockito.anyString());
    }*/
}
