package com.e_commerce.Store.repository;

import com.e_commerce.Store.model.entity.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Products, Long> {
}
