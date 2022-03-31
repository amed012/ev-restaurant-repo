package com.app.restaurantReviews.application;

import com.app.restaurantReviews.domain.Restaurant;
import com.app.restaurantReviews.domain.User;
import com.app.restaurantReviews.infrastructure.IrestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IrestaurantServiceImp implements IrestaurantService {
    @Autowired
    IrestaurantDao irestauarntDao;
    @Override
    public void addRestaurant(Restaurant restaurant) {
        irestauarntDao.save(restaurant);
    }

    @Override
    public List<Restaurant> getAllRestaurants() {
        return (List<Restaurant>) irestauarntDao.findAll();
    }

	@Override
	public void deleteRestaurantById(Long idRestaurant) {
		irestauarntDao.deleteById(idRestaurant);
		
	}

	@Override
	public void updateRestaurant(Restaurant restaurant) {
		Restaurant restaurantUpdated= irestauarntDao.findById(restaurant.getIdRestaurant()).get();
		restaurantUpdated.setEmail(restaurant.getEmail());
		restaurantUpdated.setAdresse(restaurant.getAdresse());
		restaurantUpdated.setCategorie(restaurant.getCategorie());
		restaurantUpdated.setDescription(restaurant.getDescription());
		restaurantUpdated.setActive(restaurant.getActive());

		irestauarntDao.save(restaurant);
		
	}

	@Override
	public  Restaurant findByName(String restaurantName) {
		return irestauarntDao.findByName(restaurantName);
		
	}
}
