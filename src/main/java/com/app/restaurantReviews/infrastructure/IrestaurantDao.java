package com.app.restaurantReviews.infrastructure;

import com.app.restaurantReviews.domain.Restaurant;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IrestaurantDao extends CrudRepository<Restaurant, Long> {
	
	 @Query(" FROM Restaurant  WHERE categorie = :restaurantName  ")
      Restaurant findByName(String restaurantName);
}
