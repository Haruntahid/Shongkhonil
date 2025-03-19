package com.e_commerce.Store.model.mapper;


import com.e_commerce.Store.model.dto.ProductDto;
import com.e_commerce.Store.model.entity.Category;
import com.e_commerce.Store.model.entity.Colors;
import com.e_commerce.Store.model.entity.Products;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductMapper {

    public Products map(ProductDto dto) {
        Products entity = new Products();
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        entity.setDescription(dto.getDescription());
        entity.setImageUrl(dto.getImageUrl());
        entity.setStock(dto.getStock());
        if (dto.getCategoryIds() != null) {
            List<Category> categories = dto.getCategoryIds().stream()
                    .map(id -> {
                        Category category = new Category();
                        category.setId(id);
                        return category;
                    }).collect(Collectors.toList());

            entity.setCategory(categories);
        }
        if (dto.getColorIds() != null) {
            List<Colors> colors = dto.getColorIds().stream()
                    .map(id -> {
                        Colors color = new Colors();
                        color.setId(id);
                        return color;
                    }).collect(Collectors.toList());

            entity.setColors(colors);
        }
        return entity;
    }
}
