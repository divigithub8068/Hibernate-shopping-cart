package com.ty.shopping_kart.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.shopping_kart.dto.User;
import com.ty.shopping_kart.service.UserService;

public class UserControl {
	public static void main(String[] args) {
		List<User> list = new ArrayList<User>();
//		User user = new User();
//		user.setId(3);
//		user.setName("Prashi");
//		user.setEmail("prashi@gmail.com");
//		user.setPassword("prashi@123");

		UserService userService = new UserService();
//		userService.saveUserService(user);

//		User user =userService.getUserById(2);
//		if(user!=null)
//		{
//			System.out.println("User Id     :"+user.getId());
//			System.out.println("User Name   :"+user.getName());
//			System.out.println("User Email  :"+user.getEmail());
//		}
//		else
//		{
//			System.out.println("No data is found");
//		}

//		list=userService.getAllUser();
//		for(User user:list)
//		{
//			System.out.println("User Id     :"+user.getId());
//			System.out.println("User Name   :"+user.getName());
//			System.out.println("User Email  :"+user.getEmail());
//			System.out.println("----------------------------------------");
//		}
//		boolean result = userService.deleteUserById(3);
//		if(result)
//		{
//			System.out.println("Successfully deleted");
//		}
//		else
//		{
//			System.out.println("No data deleted");
//		}
		list = userService.validateUserByEmailString("prashi@gmail.com", "prashi@123");
		if(list.size()>0)
		{
			for(User user:list)
			{
				System.out.println("User Id     :" + user.getId());
				System.out.println("User Name   :" + user.getName());
				System.out.println("User Email  :" + user.getEmail());
				System.out.println("----------------------------------------");
			}
		}
		else {
			System.out.println("Data is not exist");
		}
	}

}
