package com.example.demo.repository.crmrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.crmentity.FeaturesForUser;
import org.springframework.stereotype.Repository;

@Repository
public interface FeaturesForUserRepository extends JpaRepository<FeaturesForUser,Integer>{

}
