package com.servbytefooddelivery.data.repositories;

import com.servbytefooddelivery.data.models.Meal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

//@Repository
public interface MealRepository extends JpaRepository<Meal, String> {
}
