package com.example.demo.repository.vendorrepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.vendorentity.Distributer;
import org.springframework.stereotype.Repository;

@Repository
public interface DistributerRepository extends JpaRepository<Distributer,Integer>{

}
