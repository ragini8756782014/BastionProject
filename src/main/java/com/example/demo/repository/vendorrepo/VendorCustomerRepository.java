package com.example.demo.repository.vendorrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.vendorentity.VendorsCustomers;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorCustomerRepository extends JpaRepository<VendorsCustomers, Integer>{

}
