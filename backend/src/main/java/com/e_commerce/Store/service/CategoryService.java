package com.e_commerce.Store.service;

import com.e_commerce.Store.model.entity.Category;
import org.springframework.stereotype.Service;

@Service
public interface CategoryService {
    void createCategory(Category category);
    void deleteCategory(Long id);
    void updateCategory(Long id, Category category);
    Category find(Long id);
}
