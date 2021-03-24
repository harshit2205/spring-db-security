package com.example.jpaSecurityDemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.jpaSecurityDemo.model.User;
import com.example.jpaSecurityDemo.repository.UserCredRepo;
import com.example.jpaSecurityDemo.util.CustomUserDetails;

@Service
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	UserCredRepo userRepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		Optional<User> user = userRepo.findByUserN(username);
		user.orElseThrow(() -> new UsernameNotFoundException("not found" + username));
		return user.map(CustomUserDetails::new).get();
	}
}
 