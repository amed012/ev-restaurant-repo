package com.app.restaurantReviews.exposition;

import com.app.restaurantReviews.application.IrestaurantService;
import com.app.restaurantReviews.application.IuserSerivce;
import com.app.restaurantReviews.domain.Restaurant;
import com.app.restaurantReviews.domain.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Restaurant")
@CrossOrigin
public class RestaurantController {
    @Autowired
    IrestaurantService irestaurentService;

    @PostMapping("/addRestaurent")
    public void addRestaurant(@RequestBody Restaurant restaurant) {

        irestaurentService.addRestaurant(restaurant);

    }

    @RequestMapping(value = "/AllRestaurent", method = RequestMethod.GET)
    public List<Restaurant> getAllRestaurants() {

        return irestaurentService.getAllRestaurants();

    }
    
    @DeleteMapping(value = "/deleteRestaurant")
    public ResponseEntity<Long> deleteRestaurantById(@Param("id") Long idRestaurant) {
    	irestaurentService.deleteRestaurantById(idRestaurant);
        return new ResponseEntity<>(idRestaurant, HttpStatus.OK);
    }
    
    @PostMapping("/updateRestaurant")
    public void updateRestaurant(@RequestBody Restaurant restaurant) {

    	irestaurentService.updateRestaurant(restaurant);

    }

    @RequestMapping(value = "/restaurantByName", method = RequestMethod.GET)
    public List<Restaurant> getRestaurantByUserName(@Param("name") String name) {

        return irestaurentService.findByName(name);

    }
 
}
