package com.example.demo.repository.crmrepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.crmentity.OnlineActivation;
import com.example.demo.dto.BastionDto;


@Repository
public interface OnlineActivationRepository  extends JpaRepository<OnlineActivation, Integer> {

	@Query(value = "SELECT u.Inv_id_fk,u.system_count,u.status,u.os,u.create_date,u.expiry_date, a.user_name,a.user_email_id,a.user_address,a.mobile_no" +
            "FROM OnlineActivation u " +
            "LEFT JOIN OnlineLicense a ON u.license_key = a.license_key",
    nativeQuery = true)
	List<BastionDto> fetchBastionDtoLeftJoin();
	
	@Query("SELECT e.sr_no FROM OnlineActivation e WHERE e.license_key = :license_key")
    int findSrNoByLicenseKeyValue(String license_key);
	
}
