package com.example.demo.repository.crmrepo;

import com.example.demo.entity.crmentity.Invoices;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InvoicesRepository extends JpaRepository<Invoices,Integer> {
}
