package com.example.demo.model;

import lombok.Data;

@Data
public class Pay {
    private int id;
    private String tradeNo;
    private String amount;
    private String name;
    private  String kind; 
}
