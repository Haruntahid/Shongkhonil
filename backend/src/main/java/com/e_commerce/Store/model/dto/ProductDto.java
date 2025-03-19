package com.e_commerce.Store.model.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;


@Data
public class ProductDto {
    @NotNull(message = "Name cannot be empty.")
    private String name;

    @Size(max = 250, message = "Description cannot be longer than 250 characters.")
    private String description;

    @NotNull(message = "Price cannot be empty.")
    @Min(value = 0, message = "Price cannot be lower than 0")
    private double price;
    private double stock;
    @NotNull(message = "Image Require")
    private String imageUrl;

    private List<Long> categoryIds;
    private List<Long> colorIds;
}
