package com.e_commerce.Store.model.mapper;


import com.e_commerce.Store.model.dto.UserDto;
import com.e_commerce.Store.model.entity.Role;
import com.e_commerce.Store.model.entity.Users;
import com.e_commerce.Store.repository.RoleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final PasswordEncoder passwordEncoder;
    private final RoleRepository roleRepository;

    public Users map(UserDto dto) {
        Users entity = new Users();
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setPhone(dto.getPhone());
        entity.setUsername(dto.getUsername());
        // Map role IDs to Role entities
        entity.setEmail(dto.getEmail());
//        entity.setPassword(dto.getPassword());
        return entity;
    }


    public Users updateUser(Users existing, UserDto dto) {
        existing.setFirstName(dto.getFirstName());
        existing.setLastName(dto.getLastName());
        existing.setPhone(dto.getPhone());
        existing.setUsername(dto.getUsername());
        existing.setEmail(dto.getEmail());
//        existing.setPassword(dto.getPassword());
        return existing;
    }
}
