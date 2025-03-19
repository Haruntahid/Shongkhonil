package com.e_commerce.Store.service;

import com.e_commerce.Store.model.entity.Products;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    void createProduct(Products product);

}
