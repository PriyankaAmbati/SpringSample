package com.authorizationMicroservice.service;

import java.util.ArrayList;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.authorizationMicroservice.repository.LoginRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
	private LoginRepository loginRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		com.authorizationMicroservice.model.User user = loginRepository.findByUsername(username);

		//System.out.println("Users: " + loginRepository.findAll());

		if (user == null) {
			// to be deleted
			System.out.println("User not found:" + username);
			throw new UsernameNotFoundException("User not found !!");
		}
		System.out.println("User found: " + user.getUsername());

		return new User(user.getUsername(), user.getPassword(), new ArrayList<>());
		
<<<<<<< HEAD
		  //removed added comments
		//hello there i am new branch
=======
		  //removed added comments ok done creating new branch
>>>>>>> branch 'PriyankaAmbati-patch-1' of https://github.com/PriyankaAmbati/SpringSample.git
	}
}
//trying to merge
