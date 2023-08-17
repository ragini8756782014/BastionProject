package com.example.demo.repository.vendorrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.vendorentity.DistributedAccessTokens;
import org.springframework.stereotype.Repository;

@Repository
public interface DistributedAccessTokenRepository extends JpaRepository<DistributedAccessTokens,Integer>{

}
