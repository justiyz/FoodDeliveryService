package com.servbytefooddelivery.service;

import com.servbytefooddelivery.data.models.Meal;
import com.servbytefooddelivery.data.models.Menu;
import com.servbytefooddelivery.data.models.ServiceProvider;
import com.servbytefooddelivery.dto.MealDto;
import com.servbytefooddelivery.dto.SelectServiceProvider;
import com.servbytefooddelivery.service.exception.ServbyteException;

import java.util.List;

public interface ServbyteFoodDeliveryService {

    void addMealToMenu(Meal meal);

    public Menu showMenuOfSelectedServiceProvider(ServiceProvider serviceProvider) throws ServbyteException;

    public List<ServiceProvider> findServiceProviderByCity(String city) throws ServbyteException;

    Menu showMenuOfSelectedProvider(SelectServiceProvider selectServiceProvider);

    Meal showChosenMealDetails(SelectServiceProvider selectServiceProvider, MealDto chooseAMeal) throws ServbyteException;

    ServiceProvider saveServiceProvider(ServiceProvider serviceProvider);



}
