package com.example.demo.repository.vendorrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.vendorentity.CustomerOtp;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerOtpRepository extends JpaRepository<CustomerOtp,Integer>{

}
