package com.e_commerce.Store.model.mapper;


import com.e_commerce.Store.model.dto.UserDto;
import com.e_commerce.Store.model.entity.Users;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMapper {

    private final PasswordEncoder passwordEncoder;

    public Users map(UserDto dto) {
        Users entity = new Users();
        entity.setFirstName(dto.getFirstName());
        entity.setLastName(dto.getLastName());
        entity.setPhone(dto.getPhone());
        entity.setUsername(dto.getUsername());
        entity.setRoles(dto.getRoles());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        return entity;
    }


    public Users updateUser(Users existing, UserDto dto) {
        existing.setFirstName(dto.getFirstName());
        existing.setLastName(dto.getLastName());
        existing.setPhone(dto.getPhone());
        existing.setUsername(dto.getUsername());
        existing.setRoles(dto.getRoles());
        existing.setEmail(dto.getEmail());
        existing.setPassword(dto.getPassword());
        return existing;
    }
}
