package com.app.restaurantReviews.exposition;


import com.app.restaurantReviews.application.IevaluationService;
import com.app.restaurantReviews.domain.Evaluation;
import com.app.restaurantReviews.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comment")
@CrossOrigin
public class EvaluationController {

    @Autowired
    IevaluationService ievaluationService;

    @PostMapping("/addcomment")
    public void addComment(@RequestBody Evaluation evaluation) {

        ievaluationService.addComment(evaluation);

    }

    @RequestMapping(value = "/AllComments", method = RequestMethod.GET)
    public List<Evaluation> getAllComments() {

        return ievaluationService.gelALLComments();

    }

    @GetMapping("/AllCommentsByIdRestaurant")
    public List<Evaluation> getAllCommentsByIdRestaurant(@RequestParam Long idRestaurant) {

        return ievaluationService.gelALLCommentbyIdRestaurant(idRestaurant);

    }
    
    @DeleteMapping(value = "/deleteComment")
    public ResponseEntity<Long> deleteComment(@Param("id") Long idEvaluation) {
    	ievaluationService.deleteCommentById(idEvaluation);
        return new ResponseEntity<>(idEvaluation, HttpStatus.OK);
    }
    
    @PostMapping("/updateComment")
    public void updateUser(@RequestBody Evaluation evaluation) {

    	ievaluationService.updateComment(evaluation);

    }
}
