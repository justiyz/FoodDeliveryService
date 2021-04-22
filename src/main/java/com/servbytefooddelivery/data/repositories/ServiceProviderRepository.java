package com.servbytefooddelivery.data.repositories;

import com.servbytefooddelivery.data.models.City;
import com.servbytefooddelivery.data.models.ServiceProvider;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ServiceProviderRepository extends JpaRepository<ServiceProvider, String> {
    List<ServiceProvider> findAllByCity(City city);

    ServiceProvider findServiceProvidersByNameOfRestaurant(String name);
}
