package com.example.ecom_project.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor

@ToString
public class Product {
    private int id;
    private String name;
    private int quantity;
}
