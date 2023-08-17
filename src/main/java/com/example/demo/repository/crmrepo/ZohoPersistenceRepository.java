package com.example.demo.repository.crmrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.crmentity.ZohoPersistence;
import org.springframework.stereotype.Repository;

@Repository
public interface ZohoPersistenceRepository extends JpaRepository<ZohoPersistence, Integer>{

}
