package com.app.restaurantReviews.application;

import com.app.restaurantReviews.domain.User;
import com.app.restaurantReviews.infrastructure.IuserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IuserServiceImp  implements  IuserSerivce{

    @Autowired
    IuserDao iuserDao;


    @Override
    public void addUser(User user) {
        iuserDao.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return (List<User>) iuserDao.findAll();
    }

    @Override
    public void  deletUserById(Long idUser) {

           iuserDao.deleteById(idUser);


    }

	
	@Override
	public void updateUser(User user) {
		User userUpdated= iuserDao.findById(user.getIdUser()).get();
		userUpdated.setEmail(user.getEmail());
		userUpdated.setPrenom(user.getPrenom());
		userUpdated.setNom(user.getNom());
		userUpdated.setRole(user.getRole());
		userUpdated.setUsername(user.getUsername());
		iuserDao.save(userUpdated);
		
	}

	
    
}
