package com.servbytefooddelivery.service.servebyte;

import com.servbytefooddelivery.data.models.address.City;
import com.servbytefooddelivery.data.models.meal.Meal;
import com.servbytefooddelivery.data.models.meal.Menu;
import com.servbytefooddelivery.data.models.serviceProvider.ServiceProvider;
import com.servbytefooddelivery.data.repositories.MealRepository;
import com.servbytefooddelivery.data.repositories.MenuRepository;
import com.servbytefooddelivery.data.repositories.ServiceProviderRepository;
import com.servbytefooddelivery.dto.MealDto;
import com.servbytefooddelivery.dto.SelectServiceProvider;
import com.servbytefooddelivery.service.exception.ServbyteException;
import com.servbytefooddelivery.service.servebyte.ServbyteFoodDeliveryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServbyteFoodDeliveryServiceImpl implements ServbyteFoodDeliveryService {

    @Autowired
    MenuRepository menuRepository;

    @Autowired
    MealRepository mealRepository;

    @Autowired
    ServiceProviderRepository serviceProviderRepository;

    private final Logger logger = LoggerFactory.getLogger(ServiceProvider.class);


    @Override
    public void addMealToMenu(Meal meal) {
        Menu menu = new Menu();

        menu.setMeals(new ArrayList<>());
        menu.getMeals().add(meal);
        menuRepository.save(menu);
    }


    @Override
    public Menu showMenuOfSelectedServiceProvider(ServiceProvider serviceProvider) throws ServbyteException {

        ServiceProvider existingServiceProvider = serviceProviderRepository.findServiceProvidersByNameOfRestaurant(serviceProvider.getNameOfRestaurant());
        if (!existingServiceProvider.getNameOfRestaurant().equalsIgnoreCase(serviceProvider.getNameOfRestaurant())) {
            return existingServiceProvider.getMenu();
        } else {
            throw new ServbyteException("Sorry, the name of the restaurant does not exist");
        }
    }

    @Override
    public List<ServiceProvider> findServiceProviderByCity(String city) throws ServbyteException {

        return serviceProviderRepository.findAllByCity(City.valueOf(city.toUpperCase()));
    }


    @Override
    public Menu showMenuOfSelectedProvider(SelectServiceProvider selectServiceProvider) {
        return selectServiceProvider.getServiceProvider().getMenu();
    }

    @Override
    public Meal showChosenMealDetails(SelectServiceProvider selectServiceProvider, MealDto chooseAMeal) throws ServbyteException {
        List<Meal> mealsInMenu = showMenuOfSelectedProvider(selectServiceProvider).getMeals();
        Meal chosenMeal = new Meal();
        for (Meal meal : mealsInMenu) {
            if (!meal.equals(chooseAMeal.getMeal())) {
                throw new ServbyteException("Sorry, The meal is not on the menu");
            } else {
                chosenMeal = meal;
            }
        }
        return chosenMeal;
    }

    public void placeOrder(){}

    @Override
    public ServiceProvider saveServiceProvider(ServiceProvider serviceProvider) {
        return serviceProviderRepository.save(serviceProvider);
    }


}
