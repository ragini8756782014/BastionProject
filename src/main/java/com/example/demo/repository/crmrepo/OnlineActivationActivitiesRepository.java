package com.example.demo.repository.crmrepo;


import com.example.demo.entity.crmentity.OnlineActivationActivities;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineActivationActivitiesRepository extends JpaRepository<OnlineActivationActivities,Integer> {
}
