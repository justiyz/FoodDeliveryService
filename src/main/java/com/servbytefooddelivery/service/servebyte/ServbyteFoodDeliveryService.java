package com.servbytefooddelivery.service.servebyte;

import com.servbytefooddelivery.data.models.meal.Meal;
import com.servbytefooddelivery.data.models.meal.Menu;
import com.servbytefooddelivery.data.models.serviceProvider.ServiceProvider;
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
