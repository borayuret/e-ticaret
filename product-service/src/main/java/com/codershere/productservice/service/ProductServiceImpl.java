package com.codershere.productservice.service;

import com.codershere.productservice.document.Product;
import com.codershere.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductRepository productRepository;


    @Override
    public void createProduct(Product product) {
        productRepository.save(product);
    }
}
