package com.e_commerce.Store.controller;

import com.e_commerce.Store.model.dto.UserDto;
import com.e_commerce.Store.model.entity.Users;
import com.e_commerce.Store.response.ApiResponse;
import com.e_commerce.Store.utils.CrudController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.e_commerce.Store.constants.ApiConstants.BASEURL;

@RestController
@RequestMapping(BASEURL)
public class UserController implements CrudController<UserDto> {
    @Override
    public ResponseEntity<ApiResponse> create(UserDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<?> update(Long id, UserDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<?> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<?> find(Long id) {
        return null;
    }
}
