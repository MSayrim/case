package com.example.simplebankingcase.model;

import com.example.simplebankingcase.enums.TransactionType;
import lombok.Data;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Data
public abstract class Transaction {
    private ZonedDateTime date;
    private Double amount;
    private TransactionType transactionType;
    private String trackingCode;

    private String resultMessage;

    public Transaction (Double amount){
        this.amount = amount;
        this.date = ZonedDateTime.now();
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "date=" + date +
                ", amount=" + amount +
                '}';
    }
}

