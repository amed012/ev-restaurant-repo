package com.app.restaurantReviews.application;

import com.app.restaurantReviews.domain.Evaluation;
import com.app.restaurantReviews.domain.Restaurant;
import com.app.restaurantReviews.domain.User;
import com.app.restaurantReviews.infrastructure.IevaluationDao;
import com.app.restaurantReviews.infrastructure.IuserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IevaluationServiceImp implements IevaluationService{

    @Autowired
    IevaluationDao ievaluationDao;

    @Override
    public void addComment(Evaluation evaluation) {
         ievaluationDao.save(evaluation);
    }

    @Override
    public List<Evaluation> gelALLCommentbyIdRestaurant(Long idRestaurant) {
        return ievaluationDao.findALLByIdRestaurant(idRestaurant);
    }

    @Override
    public List<Evaluation> gelALLComments() {
        return (List<Evaluation>)ievaluationDao.findAll();
    }

	@Override
	public void deleteCommentById(Long idEvaluation) {
		ievaluationDao.deleteById(idEvaluation);		
	}
	@Override
	public void updateComment(Evaluation evaluation ) {
		Evaluation evaluationUpdated= ievaluationDao.findById(evaluation.getIdEvaluation()).get();
		evaluationUpdated.setCommentaire(evaluation.getCommentaire());
		evaluationUpdated.setNoteEtoile(evaluation.getNoteEtoile());
		ievaluationDao.save(evaluation);
		
	}
}
