package com.example.demo.services;

import java.sql.Savepoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.repositor;

@Service
public class UserServiceImpl implements UserService
{
	@Autowired
	private UserRepository userRepositiry;

	@Override
	public boolean registerUser(User user) 
	{
		try 
		{
			userRepositiry.save(user);
			return true;
		} catch (Exception e)
		{
			e.printStackTrace();
			return false;
		}
		
		
	}

	@Override
	public User loginUser(String email, String password) {
		User validUser=userRepositiry.findByEmail(email);
		
		if(validUser!=null&&validUser.getPassword().equals(password))
		{
			
		return validUser;
		}
		else 
		{
			return null;
		}
	}
		
		
	}


