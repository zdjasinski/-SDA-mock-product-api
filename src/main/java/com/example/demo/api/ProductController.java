package com.example.demo.api;

import com.example.demo.dto.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    private static final List<Product> products = new ArrayList<>();

    static {
        products.add(new Product("wiejska", "czosnek, ogórek kiszony, kiełbasa", 20));
    }

    @GetMapping()
    public ResponseEntity<?> getProducts() {
        return ResponseEntity.ok(new ProductResponse(ProductController.products));
    }

    @PostMapping()
    public ResponseEntity<?> addProduct(@RequestBody Product product) {
        ProductController.products.add(product);

        return ResponseEntity.ok().build();
    }
}
