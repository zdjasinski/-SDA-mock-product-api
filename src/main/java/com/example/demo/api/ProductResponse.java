package com.example.demo.api;

import com.example.demo.dto.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class ProductResponse {
    List<Product> products;
}
