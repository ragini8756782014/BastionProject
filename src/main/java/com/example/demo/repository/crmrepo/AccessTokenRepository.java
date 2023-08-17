package com.example.demo.repository.crmrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.crmentity.AccessToken;
import org.springframework.stereotype.Repository;

@Repository
public interface AccessTokenRepository  extends JpaRepository<AccessToken,Integer>{


}
