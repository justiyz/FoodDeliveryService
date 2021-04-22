package com.servbytefooddelivery.data.repositories;

import com.servbytefooddelivery.data.models.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface MenuRepository extends JpaRepository<Menu, String> {



}
