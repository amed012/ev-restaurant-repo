package com.app.restaurantReviews.application;

import com.app.restaurantReviews.domain.Evaluation;
import com.app.restaurantReviews.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IevaluationService {
    public void addComment(Evaluation evaluation);
    public List<Evaluation> gelALLCommentbyIdRestaurant(Long idRestaurant);
    public List<Evaluation> gelALLComments();
    public void deleteCommentById(Long idEvaluation);
    public void updateComment(Evaluation evaluation);
    

}
