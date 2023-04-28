package com.servbytefooddelivery.data.repositories;

import com.servbytefooddelivery.data.models.meal.Meal;
import org.springframework.data.jpa.repository.JpaRepository;

//@Repository
public interface MealRepository extends JpaRepository<Meal, String> {
}
