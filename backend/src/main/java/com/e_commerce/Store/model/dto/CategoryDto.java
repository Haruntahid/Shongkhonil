package com.e_commerce.Store.model.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
public class CategoryDto {
//    @NotNull(message = "Name cannot be empty.")
    private String name;
//    @NotNull(message = "Description cannot be empty.")
    private String description;
}
