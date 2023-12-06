package com.xyz.service;

import java.util.List;

import com.xyz.entity.Userss;

public interface UsersService {

	public Userss saveUserss(Userss userss);
	
	public List<Userss> getAllUserss() ;
	
	public Userss updateUsers(int id,Userss userss);
	
	public String deleteUser(int id);
	
}
