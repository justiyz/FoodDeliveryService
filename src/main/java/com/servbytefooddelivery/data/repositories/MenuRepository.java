package com.servbytefooddelivery.data.repositories;

import com.servbytefooddelivery.data.models.meal.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, String> {



}
