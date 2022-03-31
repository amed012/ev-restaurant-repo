package com.app.restaurantReviews.infrastructure;

import com.app.restaurantReviews.domain.Evaluation;
import com.app.restaurantReviews.domain.Restaurant;
import com.app.restaurantReviews.domain.User;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface IuserDao extends CrudRepository<User, Long> {
	 @Query(" FROM User  WHERE username = :username and password=:password  ")
	    User findUserByNameAndPassword(@Param("username") String username,@Param("password") String password);
	 @Query(" FROM User  WHERE username = :username  ")
	 List<User> findByUserName(String username);
}
