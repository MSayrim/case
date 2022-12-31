package com.example.simplebankingcase.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@Entity
@Data
public class Account<Transaction> extends BaseEntity {

    private String owner;
    private String accountNumber;
    public Account(String owner, String accountNumber) {
        this.owner = owner;
        this.accountNumber = accountNumber;
    }

    private double balance;

    @OneToMany
    private List<Transaction> transactions;


    public DepositTransaction deposit(Double amount){
        return  new DepositTransaction(amount);
    }
    public WithdrawalTransaction withdraw(Double amount){
        return  new WithdrawalTransaction(amount);
    }
    public void post (Transaction transaction){

        if(transaction instanceof WithdrawalTransaction){
        }
        if(transaction instanceof DepositTransaction){

        }

    }

}
