package com.e_commerce.Store.model.dto;

import com.e_commerce.Store.model.entity.Category;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class ProductDto {
    @NotNull(message = "Name cannot be empty.")
    private String name;

    @Max(value = 250, message = "Description cannot be longer than 250 characters.")
    private String description;

    @NotNull(message = "Price cannot be empty.")
    @Min(value = 0, message = "Price cannot be lower than 0")
    private double price;
    private double stock;
    @NotNull(message = "Image Require")
    private String imageUrl;
    private Category category;
}
