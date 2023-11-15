package com.codershere.productservice.controller;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.dto.ProductRequestDTO;
import com.codershere.productservice.dto.ProductResponseDTO;
import com.codershere.productservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    // POST http://localhost:6060/api/v1/product/MK48
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createProduct(@RequestBody ProductRequestDTO productRequestDTO)
    {
        productService.createProduct(productRequestDTO);
    }

    // GET http://localhost:6060/api/v1/product
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProductResponseDTO> getAllProducts()
    {
        return productService.getAllProducts();
    }

    // GET http://localhost:6060/api/v1/product/MK48
    @GetMapping("{id}")
    public ProductResponseDTO getProduct(@PathVariable String id)
    {
        return productService.getProduct(id);
    }


}
