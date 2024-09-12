package com.example.BankManagement.Entity;


import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date date;
    private Double amount;
    private String type; // "credit" or "debit"

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    // Getters and Setters
}
