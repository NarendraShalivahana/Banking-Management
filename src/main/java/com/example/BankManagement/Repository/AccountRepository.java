package com.example.BankManagement.Repository;



import com.example.BankManagement.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
