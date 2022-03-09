package com.app.restaurantReviews.application;

import com.app.restaurantReviews.domain.Restaurant;
import com.app.restaurantReviews.domain.User;

import org.springframework.stereotype.Service;


import java.util.List;
@Service
public interface IrestaurantService {
    public void addRestaurant(Restaurant restaurant);
    public List<Restaurant> getAllRestaurants();
    public void deleteRestaurantById(Long idRestaurant);
    public void updateRestaurant(Restaurant restaurant);

}
