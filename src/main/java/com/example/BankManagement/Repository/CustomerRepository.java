package com.example.BankManagement.Repository;
import com.example.BankManagement.Entity.Customer;


import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

