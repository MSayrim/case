package com.example.simplebankingcase.dto;

import com.example.simplebankingcase.enums.Status;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
public class TransactionStatus {


    private Status status;

    private String trackingCode;

}
