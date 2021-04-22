package com.servbytefooddelivery.data.repositories;

import com.servbytefooddelivery.data.models.Meal;
import com.servbytefooddelivery.data.models.Menu;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MenuRepositoryTest {

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    MealRepository mealRepository;

    @BeforeEach
    void setUp() {
    }

    @Test
    void testThatWeCanAddMealsToMenu(){

        Meal meal1 = Meal.builder()
                .description("long white rice + stew + chicken")
                .preparationTimeInMinutes("10 minutes")
                .pictureUrl("***###***")
                .price(1000.0)
                .build();

        Meal meal2 = Meal.builder()
                .description("pounded + white-soup + beef/stock fish")
                .preparationTimeInMinutes("15")
                .pictureUrl("---***---")
                .price(1500.0)
                .build();

        Meal meal3 = Meal.builder()
                .description("Beans + plaintain + fish")
                .preparationTimeInMinutes("10")
                .pictureUrl("---***---")
                .price(1000.0)
                .build();


        Menu menu = new Menu();
        menu.setMeals(new ArrayList<>());

        menu.getMeals().add(meal1);
        mealRepository.save(meal1);

        menu.getMeals().add(meal2);
        mealRepository.save(meal2);

        menu.getMeals().add(meal3);
        mealRepository.save(meal3);

        assertThat(menu.getMeals().size()).isEqualTo(3);

    }
}