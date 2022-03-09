package com.app.restaurantReviews.infrastructure;

import com.app.restaurantReviews.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public interface IuserDao extends CrudRepository<User, Long> {

}
