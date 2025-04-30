package com.e_commerce.Store.model.dto;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


import java.util.List;

@Data
public class UserDto {

    @NotNull(message = "firstName cannot be empty.")
    private String firstName;

    @NotNull(message = "lastName cannot be empty.")
    private String lastName;

    @NotNull(message = "username cannot be empty.")
    private String username;

    @NotNull(message = "email cannot be empty.")
    private String email;

    @NotBlank(message = "Password cannot be blank")
    private String password;

    @NotNull(message = "phone cannot be empty.")
    private String phone;

    private List<Long> roleIds;
}
