package com.example.demo.repository.vendorrepo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.example.demo.entity.vendorentity.OnlineLicense;
import org.springframework.stereotype.Repository;

@Repository

public interface OnlineLicenseRepository extends JpaRepository<OnlineLicense, Integer> {
    @Query("SELECT e.sr_no FROM OnlineLicense e WHERE e.license_key = :license_key")
    int findSrNoByLicenseKeyValue(String license_key);
	
	
}
