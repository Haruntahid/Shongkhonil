package com.e_commerce.Store.service.impl;

import com.e_commerce.Store.model.entity.Category;
import com.e_commerce.Store.repository.CategoryRepository;
import com.e_commerce.Store.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public void createCategory(Category category) {
        categoryRepository.save(category);
    }

    @Override
    public void deleteCategory(Long id) {
        Category category = find(id);
        categoryRepository.delete(category);
    }

    @Override
    public void updateCategory(Long id, Category category) {
        Category exCategory = find(id);
        exCategory.setName(category.getName());
        exCategory.setDescription(category.getDescription());
        categoryRepository.save(category);
    }

    @Override
    public Category find(Long id) {
        Optional<Category> category = categoryRepository.findById(id);
        if (category.isEmpty()) {
            throw new RuntimeException("Product not found with id " + id);
        }
        return category.get();
    }

}
