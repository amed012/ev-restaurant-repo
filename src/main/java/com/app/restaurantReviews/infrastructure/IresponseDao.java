package com.app.restaurantReviews.infrastructure;

import com.app.restaurantReviews.domain.Response;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface IresponseDao extends CrudRepository<Response, Long> {
}
