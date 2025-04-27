package com.e_commerce.Store.service.impl;

import com.e_commerce.Store.exceptions.AlreadyExistException;
import com.e_commerce.Store.exceptions.NotFoundException;
import com.e_commerce.Store.exceptions.UnauthorizedException;
import com.e_commerce.Store.jwts.JwtUtil;
import com.e_commerce.Store.model.dto.UserDto;
import com.e_commerce.Store.model.entity.Users;
import com.e_commerce.Store.model.mapper.UserMapper;
import com.e_commerce.Store.repository.UserRepository;
import com.e_commerce.Store.service.CrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserAuthService implements CrudService<Users, UserDto> {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final PasswordEncoder encoder;

    @Deprecated
    @Override
    public void create(UserDto dto) {}

    @Override
    public void delete(Long id) {
        Users user = find(id);
        userRepository.delete(user);
    }

    @Override
    public void update(Long id, UserDto dto) {
        Users existing = find(id);
        Users user = userMapper.updateUser(existing, dto);
        userRepository.save(user);
    }

    @Override
    public Users find(Long id) {
        Optional<Users> user = userRepository.findById(id);

        if(user.isEmpty()){
            throw new NotFoundException("User not found with id " + id);
        }
        return user.get();
    }

    // register with checkout => also create an order
    public String register(UserDto dto) {
        Optional<Users> userExistWithUsernameOrPhone = userRepository.findByUsernameOrPhone(dto.getUsername(), dto.getPhone());

        if (userExistWithUsernameOrPhone.isPresent()) {
            throw new AlreadyExistException("User with username or phone already exists.");
        }


        Users user = userMapper.map(dto);
        user.setPassword(encoder.encode(dto.getPassword()));
        userRepository.save(user);

        return jwtUtil.generateToken(dto.getUsername());

//        Authentication authentication = authenticationManager
//                .authenticate(new UsernamePasswordAuthenticationToken(dto.getUsername(), dto.getPassword()));
//
//        if(!authentication.isAuthenticated()) {
//            throw new UnauthorizedException("User Not Authenticated");
//        }else return jwtUtil.generateToken(dto.getUsername());
//    }
    }
};
