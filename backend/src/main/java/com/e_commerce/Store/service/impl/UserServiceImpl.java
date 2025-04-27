package com.e_commerce.Store.service.impl;

import com.e_commerce.Store.jwts.UserPrincipal;
import com.e_commerce.Store.model.dto.UserDto;
import com.e_commerce.Store.model.entity.Users;
import com.e_commerce.Store.repository.UserRepository;
import com.e_commerce.Store.service.CrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserDetailsService, CrudService<Users, UserDto> {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> user = userRepository.findByUsername(username);

        if (user.isEmpty()) {
            throw new UsernameNotFoundException(username);
        }return new UserPrincipal(user.get());
    }

    @Override
    public void create(UserDto dto) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public void update(Long id, UserDto dto) {

    }

    @Override
    public Users find(Long id) {
        return null;
    }
}
