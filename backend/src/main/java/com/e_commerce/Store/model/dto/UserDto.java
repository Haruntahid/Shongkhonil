package com.e_commerce.Store.model.dto;

import com.e_commerce.Store.model.entity.Role;
import lombok.Data;


import java.util.List;

@Data
public class UserDto {
    private String firstName;
    private String lastName;
    private String username;
    private String email;
    private String password;
    private String phone;

    List<Role> roles;
}
