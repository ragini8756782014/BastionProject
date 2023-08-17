package com.example.demo.repository.crmrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.crmentity.ZohoClients;
import org.springframework.stereotype.Repository;

@Repository
public interface ZohoClientsRepository extends JpaRepository<ZohoClients, Integer>{

}
