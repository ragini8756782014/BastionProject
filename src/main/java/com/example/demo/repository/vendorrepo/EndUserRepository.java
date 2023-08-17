package com.example.demo.repository.vendorrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.vendorentity.EndUser;
import org.springframework.stereotype.Repository;

@Repository
public interface EndUserRepository extends JpaRepository<EndUser,Integer>{

}
