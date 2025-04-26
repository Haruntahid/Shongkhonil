package com.e_commerce.Store.model.mapper;

import com.e_commerce.Store.model.dto.CategoryDto;
import com.e_commerce.Store.model.entity.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryMapper {
    public Category map(CategoryDto dto){
        Category entity = new Category();
        entity.setName(dto.getName());
        entity.setDescription(dto.getDescription());
        return entity;
    }

    public CategoryDto map(Category entity){
        CategoryDto dto = new CategoryDto();
        dto.setName(entity.getName());
        dto.setDescription(entity.getDescription());
        return dto;
    }

}
