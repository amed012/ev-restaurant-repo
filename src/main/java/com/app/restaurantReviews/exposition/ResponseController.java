package com.app.restaurantReviews.exposition;


import com.app.restaurantReviews.application.IresponseService;
import com.app.restaurantReviews.domain.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/response")
@CrossOrigin
public class ResponseController {

    @Autowired
    IresponseService iresponseService;

    @PostMapping("/addResponseToComment")
    public void addResponse(@RequestBody Response response) {

        iresponseService.addResponseToComment(response);

    }

    @RequestMapping(value = "/AllResponses", method = RequestMethod.GET)
    public List<Response> getAllResponse() {

        return iresponseService.getAllResponses();

    }
}
