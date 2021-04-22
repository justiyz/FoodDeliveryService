package com.servbytefooddelivery.web.controllers;

import com.servbytefooddelivery.data.models.City;
import com.servbytefooddelivery.data.models.ServiceProvider;
import com.servbytefooddelivery.service.ServbyteFoodDeliveryServiceImpl;
import com.servbytefooddelivery.service.exception.ServbyteException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class ServbyteControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Autowired
    ServbyteFoodDeliveryServiceImpl servbyteFoodDeliveryServiceImpl;

    ServiceProvider serviceProvider;

    @BeforeEach
    void setUp() {
        serviceProvider = new ServiceProvider();
        serviceProvider = new ServiceProvider();
        serviceProvider.setCity(City.ABUJA);
        servbyteFoodDeliveryServiceImpl.saveServiceProvider(serviceProvider);

        ServiceProvider provider2 = new ServiceProvider();
        provider2.setCity(City.ABUJA);
        servbyteFoodDeliveryServiceImpl.saveServiceProvider(provider2);

        ServiceProvider provider3 = new ServiceProvider();
        provider3.setCity(City.ABUJA);
        servbyteFoodDeliveryServiceImpl.saveServiceProvider(provider3);

        ServiceProvider provider4 = new ServiceProvider();
        provider3.setCity(City.IBADAN);
        servbyteFoodDeliveryServiceImpl.saveServiceProvider(provider4);

        ServiceProvider provider5 = new ServiceProvider();
        provider3.setCity(City.IBADAN);
        servbyteFoodDeliveryServiceImpl.saveServiceProvider(provider5);

        ServiceProvider provider6 = new ServiceProvider();
        provider3.setCity(City.LAGOS);
        servbyteFoodDeliveryServiceImpl.saveServiceProvider(provider6);

        ServiceProvider provider7 = new ServiceProvider();
        provider3.setCity(City.IBADAN);
        servbyteFoodDeliveryServiceImpl.saveServiceProvider(provider7);

        ServiceProvider provider8 = new ServiceProvider();
        provider3.setCity(City.ASABA);
        servbyteFoodDeliveryServiceImpl.saveServiceProvider(provider8);

    }

    @Test
    void testThatWeCanFindServiceProviderByCity() throws Exception {

        this.mockMvc.perform(post("/api/servbyte/findServiceProviderByCity/Abuja"))
                .andDo(print())
                .andExpect(status().isFound())
                .andReturn();


    }


}