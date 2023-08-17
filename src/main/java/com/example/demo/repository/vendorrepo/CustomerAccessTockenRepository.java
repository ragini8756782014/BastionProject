package com.example.demo.repository.vendorrepo;

import com.example.demo.entity.vendorentity.CustomerAccessTockens;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerAccessTockenRepository extends JpaRepository<CustomerAccessTockens,Integer> {
}
