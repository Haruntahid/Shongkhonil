package com.e_commerce.Store.service;

import com.e_commerce.Store.model.dto.ProductDto;
import com.e_commerce.Store.model.entity.Products;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {

    void createProduct(Products product);

    void updateProduct(Long id, ProductDto dto);

    void deleteProduct(Long id);

    Products getProduct(Long id);

}
