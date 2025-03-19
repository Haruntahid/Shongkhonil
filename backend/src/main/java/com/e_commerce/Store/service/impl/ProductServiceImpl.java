package com.e_commerce.Store.service.impl;

import com.e_commerce.Store.model.entity.Products;
import com.e_commerce.Store.repository.ProductRepository;
import com.e_commerce.Store.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public void createProduct(Products product) {
        productRepository.save(product);
    }
}
