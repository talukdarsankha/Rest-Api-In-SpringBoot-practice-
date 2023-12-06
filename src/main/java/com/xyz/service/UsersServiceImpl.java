package com.xyz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xyz.entity.Userss;
import com.xyz.repository.UserRepo;

@Service
public class UsersServiceImpl implements UsersService {
  @Autowired
  private UserRepo ur;
	
	@Override
	public Userss saveUserss(Userss userss) {
		// TODO Auto-generated method stub
		return ur.save(userss);
	}

	@Override
	public List<Userss> getAllUserss() {
		// TODO Auto-generated method stub
		return ur.findAll();
	}

	@Override
	public Userss updateUsers(int id, Userss userss) {
		// TODO Auto-generated method stub
		userss.setId(id);
		return ur.save(userss);
	}

	@Override
	public String deleteUser(int id) {
		// TODO Auto-generated method stub
		Userss u= ur.findById(id).get();
		if(u!=null) {
			ur.delete(u);
			return "User Deleted Successfully";
		}
		return "User is not present";
	}
	
	

}
