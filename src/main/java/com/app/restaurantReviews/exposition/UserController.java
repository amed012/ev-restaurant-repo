package com.app.restaurantReviews.exposition;

import com.app.restaurantReviews.application.IuserSerivce;
import com.app.restaurantReviews.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    IuserSerivce iuserSerivce;

    @PostMapping("/addUser")
    public void postBody(@RequestBody User user) {

        iuserSerivce.addUser(user);

    }


    @RequestMapping(value = "/AllUser", method = RequestMethod.GET)
    public List<User> getAllUsers() {

            return iuserSerivce.getAllUsers();


    }

    @DeleteMapping(value = "/deleteUser")
    public ResponseEntity<Long> deleteById(@Param("id") Long idUser) {
        iuserSerivce.deletUserById(idUser);
        return new ResponseEntity<>(idUser, HttpStatus.OK);
    }
    
    @PostMapping("/updateUser")
    public void updateUser(@RequestBody User user) {

        iuserSerivce.updateUser(user);

    }




}
