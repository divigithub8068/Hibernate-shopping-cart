package com.ty.shopping_kart.service;

import java.util.List;

import com.ty.shopping_kart.dao.UserDao;
import com.ty.shopping_kart.dto.User;
import com.ty.shopping_kart.util.AES;

public class UserService
{
	UserDao dao = new UserDao();
	public User saveUserService(User user)
	{
		return dao.saveUser(user);
	}

	public User getUserById(int id)
	{
		return dao.getUserById(id);
	}
	public List<User> getAllUser()
	{
		return dao.getAllUser();
	}
	public boolean deleteUserById(int id)
	{
		return dao.deleteUserById(id);
	}
	public List<User> validateUserByEmailString(String email,String password)
	{
		return dao.validateUserByEmailString(email, password);
	}
}
