package com.example.demo.repository.crmrepo;

import com.example.demo.entity.vendorentity.CustomerAccessTockens;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.crmentity.DeveloperAccount;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperAccountRepository extends JpaRepository<DeveloperAccount,Integer>{

    @Repository
    interface CustomerAccessTokensRepository extends JpaRepository<CustomerAccessTockens,Integer>{
    
    }
}
