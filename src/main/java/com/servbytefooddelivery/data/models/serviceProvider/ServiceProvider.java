package com.servbytefooddelivery.data.models.serviceProvider;

import com.servbytefooddelivery.data.models.address.City;
import com.servbytefooddelivery.data.models.meal.Menu;
import lombok.*;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServiceProvider {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String nameOfRestaurant;

    private String email;

    private String phoneNumber;

    @Enumerated
    private City city;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Menu menu;
}
