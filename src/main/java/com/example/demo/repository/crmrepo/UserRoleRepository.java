package com.example.demo.repository.crmrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.crmentity.UserRole;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Integer>{

}
