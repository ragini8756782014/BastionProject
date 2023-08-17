package com.example.demo.repository.crmrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.crmentity.Features;
import org.springframework.stereotype.Repository;

@Repository
public interface FeaturesRepository extends JpaRepository<Features,Integer>{

}
