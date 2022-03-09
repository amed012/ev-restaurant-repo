package com.app.restaurantReviews.application;

import com.app.restaurantReviews.domain.Response;
import com.app.restaurantReviews.infrastructure.IresponseDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IresponseServiceImp implements IresponseService {
    @Autowired
    IresponseDao iresponseDao;

    @Override
    public void addResponseToComment(Response response) {
        iresponseDao.save(response);
    }

    @Override
    public List<Response> getAllResponses() {
        return (List<Response>) iresponseDao.findAll();
    }
}
