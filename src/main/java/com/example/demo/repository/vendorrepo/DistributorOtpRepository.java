package com.example.demo.repository.vendorrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.vendorentity.DistributerOtp;
import org.springframework.stereotype.Repository;

@Repository
public interface DistributorOtpRepository extends JpaRepository<DistributerOtp,Integer>{

}
