package com.servbytefooddelivery.service;

import com.servbytefooddelivery.data.models.address.City;
import com.servbytefooddelivery.data.models.meal.Meal;
import com.servbytefooddelivery.data.models.meal.Menu;
import com.servbytefooddelivery.data.models.serviceProvider.ServiceProvider;
import com.servbytefooddelivery.data.repositories.MealRepository;
import com.servbytefooddelivery.data.repositories.MenuRepository;
import com.servbytefooddelivery.data.repositories.ServiceProviderRepository;
import com.servbytefooddelivery.dto.SelectServiceProvider;
import com.servbytefooddelivery.service.exception.ServbyteException;
import com.servbytefooddelivery.service.servebyte.ServbyteFoodDeliveryServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class ServbyteFoodDeliveryServiceImplTest {

    @Autowired
    ServbyteFoodDeliveryServiceImpl servbyteFoodDeliveryServiceImpl;

    @Autowired
    ServiceProviderRepository serviceProviderRepository;

    @Autowired
    MealRepository mealRepository;

    @Autowired
    MenuRepository menuRepository;

    ServiceProvider serviceProvider;

    @BeforeEach
    void setUp() {
        serviceProvider = new ServiceProvider();
        serviceProvider.setCity(City.ABUJA);
        serviceProviderRepository.save(serviceProvider);

        ServiceProvider provider2 = new ServiceProvider();
        provider2.setCity(City.ABUJA);
        serviceProviderRepository.save(provider2);

        ServiceProvider provider3 = new ServiceProvider();
        provider3.setCity(City.ABUJA);
        serviceProviderRepository.save(provider3);

        ServiceProvider provider4 = new ServiceProvider();
        provider3.setCity(City.IBADAN);
        serviceProviderRepository.save(provider4);

        ServiceProvider provider5 = new ServiceProvider();
        provider3.setCity(City.IBADAN);
        serviceProviderRepository.save(provider5);

        ServiceProvider provider6 = new ServiceProvider();
        provider3.setCity(City.LAGOS);
        serviceProviderRepository.save(provider6);

        ServiceProvider provider7 = new ServiceProvider();
        provider3.setCity(City.IBADAN);
        serviceProviderRepository.save(provider7);

        ServiceProvider provider8 = new ServiceProvider();
        provider3.setCity(City.ASABA);
        serviceProviderRepository.save(provider8);


        Meal meal1 = Meal.builder()
                .description("long white rice + stew + chicken")
                .preparationTimeInMinutes(10)
                .imageUrl("***###***")
                .price(BigDecimal.valueOf(1000.0))
                .build();

        Meal meal2 = Meal.builder()
                .description("pounded + white-soup + beef/stock fish")
                .preparationTimeInMinutes(15)
                .imageUrl("---***---")
                .price(BigDecimal.valueOf(5000.0))
                .build();

        serviceProvider.setMenu(new Menu());
        serviceProvider.getMenu().setMeals(new ArrayList<>());
        serviceProvider.getMenu().getMeals().add(meal1);
        serviceProvider.getMenu().getMeals().add(meal2);
        serviceProviderRepository.save(serviceProvider);

        provider4.setMenu(new Menu());
        provider4.getMenu().setMeals(new ArrayList<>());
        provider4.getMenu().getMeals().add(meal2);
        serviceProviderRepository.save(provider4);

    }

    @Test
    void AddMealsToMenuTest() {
        Menu menu = new Menu();
        List<Meal> meals = new ArrayList<>();

        Meal meal1 = Meal.builder()
                .description("long white rice + stew + chicken")
                .preparationTimeInMinutes(10)
                .imageUrl("***###***")
                .price(BigDecimal.valueOf(1000.0))
                .build();
        meals.add(meal1);

        Meal meal2 = Meal.builder()
                .description("pounded + white-soup + beef/stock fish")
                .preparationTimeInMinutes(15)
                .imageUrl("---***---")
                .price(BigDecimal.valueOf(5000.0))
                .build();
        meals.add(meal2);
        mealRepository.saveAll(meals);

        menu = Menu.builder()
                .meals(meals)
                .build();
        menuRepository.save(menu);

        assertThat(menu.getMeals()).isNotEmpty();
        assertThat(menu.getMeals().size()).isEqualTo(2);

    }


    @Test
    void test_find_service_provider_by_city() throws ServbyteException {
        List<ServiceProvider> serviceProviders = servbyteFoodDeliveryServiceImpl.findServiceProviderByCity("Abuja");
        assertThat(serviceProviders.size()).isEqualTo(3);
    }


    @Test
    void test_I_Can_View_Menu_Of_Selected_Restaurant() {
        SelectServiceProvider selectServiceProvider = new SelectServiceProvider();
        selectServiceProvider.setServiceProvider(serviceProvider);
        Menu menu = servbyteFoodDeliveryServiceImpl.showMenuOfSelectedProvider(selectServiceProvider);

        assertThat(menu.getMeals().size()).isEqualTo(2);
    }


}