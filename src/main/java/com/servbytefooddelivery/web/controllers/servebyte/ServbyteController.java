package com.servbytefooddelivery.web.controllers.servebyte;

import com.servbytefooddelivery.data.models.meal.Menu;
import com.servbytefooddelivery.data.models.serviceProvider.ServiceProvider;
import com.servbytefooddelivery.dto.SelectServiceProvider;
import com.servbytefooddelivery.service.servebyte.ServbyteFoodDeliveryServiceImpl;
import com.servbytefooddelivery.service.exception.ServbyteException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/service-provider")
public class ServbyteController {

    @Autowired
    ServbyteFoodDeliveryServiceImpl servbyteFoodDeliveryServiceImpl;

    @PostMapping("/{city}")
    public ResponseEntity<?> findProviderByCity(@PathVariable String city) throws ServbyteException {
        List<ServiceProvider> serviceProviderList;
        serviceProviderList = servbyteFoodDeliveryServiceImpl.findServiceProviderByCity(city);
        return new ResponseEntity<>(serviceProviderList, HttpStatus.FOUND);
    }

    @PostMapping("/menu")
    public ResponseEntity<?> showMenu(SelectServiceProvider selectServiceProvider){
        Menu menu = servbyteFoodDeliveryServiceImpl.showMenuOfSelectedProvider(selectServiceProvider);
       return new ResponseEntity<>(menu, HttpStatus.OK);
    }


}
