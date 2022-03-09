package com.app.restaurantReviews.infrastructure;

import com.app.restaurantReviews.domain.Evaluation;
import com.app.restaurantReviews.domain.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IevaluationDao extends CrudRepository<Evaluation, Long> {
    @Query(" FROM Evaluation  WHERE id_restaurant = :idRestaurant ")
    List<Evaluation> findALLByIdRestaurant(@Param("idRestaurant") Long idRestaurant);
}
