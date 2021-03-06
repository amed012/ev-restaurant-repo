package com.app.restaurantReviews.application;

import com.app.restaurantReviews.domain.Restaurant;
import com.app.restaurantReviews.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IuserSerivce {
    public void addUser(User user);
    public List<User> getAllUsers();
    public void deletUserById(Long idUser);
    public void updateUser(User user);
	public User getUserByUserNameAndPassword(String username, String password);
	List<User> findByUserName(String userName);
}
