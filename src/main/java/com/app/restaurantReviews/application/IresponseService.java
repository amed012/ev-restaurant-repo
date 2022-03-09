package com.app.restaurantReviews.application;

import com.app.restaurantReviews.domain.Response;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IresponseService {
    public void addResponseToComment(Response response);
    public List<Response> getAllResponses();
    
}
