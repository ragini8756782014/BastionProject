package com.example.demo.repository.crmrepo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.crmentity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository  extends JpaRepository<User, Integer> {

	Optional<User> findByUserName(String user_name);

	
	
}
