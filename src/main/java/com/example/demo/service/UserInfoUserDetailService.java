package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.configuration.UserInfoUserDetails;
import com.example.demo.entity.crmentity.User;
import com.example.demo.repository.crmrepo.UserInfoRepository;


@Component
public class UserInfoUserDetailService implements UserDetailsService {

	@Autowired
	private UserInfoRepository userInfoRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<User> user =userInfoRepository.findByUserName(username);
		
		return user.map(UserInfoUserDetails::new)
		.orElseThrow(()->new UsernameNotFoundException("user not found "+ username));
		
	}

}
