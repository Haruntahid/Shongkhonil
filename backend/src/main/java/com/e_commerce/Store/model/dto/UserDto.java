package com.e_commerce.Store.model.dto;

import com.e_commerce.Store.model.entity.Role;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;


import java.util.List;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
//    @NotBlank(message = "Password cannot be blank")
//    private String password;
    private String phone;

    List<Role> roles;
}
