package com.example.demo.repository.crmrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.crmentity.Otp;
import org.springframework.stereotype.Repository;

@Repository
public interface OtpRepository  extends JpaRepository<Otp, Integer> {

}
