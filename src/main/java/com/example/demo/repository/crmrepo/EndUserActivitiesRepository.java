package com.example.demo.repository.crmrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.crmentity.EndUserActivities;
import org.springframework.stereotype.Repository;

@Repository
public interface EndUserActivitiesRepository extends JpaRepository<EndUserActivities,Integer>{

}
