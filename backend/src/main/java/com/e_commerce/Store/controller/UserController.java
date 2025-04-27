package com.e_commerce.Store.controller;

import com.e_commerce.Store.model.dto.UserDto;
import com.e_commerce.Store.response.ApiResponse;
import com.e_commerce.Store.response.ResponseWithData;
import com.e_commerce.Store.response.ServerResponse;
import com.e_commerce.Store.service.impl.UserAuthService;
import com.e_commerce.Store.utils.CrudController;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.e_commerce.Store.constants.ApiConstants.*;

@RestController
@RequestMapping(BASEURL)
@RequiredArgsConstructor
public class UserController implements CrudController<UserDto> {

    private final UserAuthService userAuthService;


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

    @PostMapping(CREATE_ORDER)
    public ResponseEntity<ResponseWithData> checkOut(@Valid @RequestBody UserDto dto) {
        userAuthService.register(dto);
        return ServerResponse.withData("Order Created Successfully",userAuthService.register(dto));
    }

}
