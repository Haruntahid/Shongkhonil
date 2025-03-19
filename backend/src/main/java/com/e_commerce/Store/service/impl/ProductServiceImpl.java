package com.e_commerce.Store.service.impl;

import com.e_commerce.Store.model.dto.ProductDto;
import com.e_commerce.Store.model.entity.Products;
import com.e_commerce.Store.model.mapper.ProductMapper;
import com.e_commerce.Store.repository.ProductRepository;
import com.e_commerce.Store.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    @Override
    public void createProduct(Products product) {
        productRepository.save(product);
    }

    @Override
    public void updateProduct(Long id, ProductDto dto) {
        Products exProduct = getProduct(id);
        productMapper.updateEntity(exProduct, dto); // Use mapper to update fields
        productRepository.save(exProduct);
    }

    @Override
    public void deleteProduct(Long id) {
        Products product = getProduct(id);
        productRepository.delete(product);
    }

    @Override
    public Products getProduct(Long id) {
        Optional<Products> product = productRepository.findById(id);
        if (product.isEmpty()) {
            throw new RuntimeException("Product not found with id " + id);
        }
        return product.get();
    }
}
