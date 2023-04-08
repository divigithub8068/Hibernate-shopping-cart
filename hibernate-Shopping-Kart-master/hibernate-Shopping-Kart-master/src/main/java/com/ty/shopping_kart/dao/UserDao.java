package com.ty.shopping_kart.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.shopping_kart.dto.User;

public class UserDao {
//	List<User > list = new ArrayList<User>();
	public User saveUser(User user) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User getUserById(int id) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		return entityManager.find(User.class, id);
	}
	public List<User> getAllUser()
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql = "Select u from User u";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}
	public boolean deleteUserById(int id)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		User user = entityManager.find(User.class, id);
		if(user != null)
		{
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		else {
			return false;
		}
	}
	public List<User> validateUserByEmailString(String email,String password)
	{
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("prashi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		String sql = "select u from User u where u.email=?1 and u.password=?2";
		
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, "prashi@gmail.com");
		query.setParameter(2, "prashi@123");
		return query.getResultList();
	}
}
