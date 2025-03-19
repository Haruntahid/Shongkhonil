package com.e_commerce.Store.controller;

import com.e_commerce.Store.model.dto.ProductDto;
import com.e_commerce.Store.model.entity.Products;
import com.e_commerce.Store.model.mapper.ProductMapper;
import com.e_commerce.Store.response.ApiResponse;
import com.e_commerce.Store.response.ServerResponse;
import com.e_commerce.Store.service.ProductService;
import com.e_commerce.Store.utils.CrudController;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.e_commerce.Store.constants.ApiConstants.*;

@RestController
@RequestMapping(BASEURL)
@RequiredArgsConstructor
public class ProductController implements CrudController<ProductDto> {

    private final ProductService productService;
    private final ProductMapper productMapper;

    @Override
    @PostMapping(UPLOAD_PRODUCT)
    public ResponseEntity<ApiResponse> create(@Valid @RequestBody ProductDto dto) {
        productService.createProduct(productMapper.map(dto));
        return ServerResponse.created("Product Created Successfully");
    }

    @Override
    public ResponseEntity<ApiResponse> update(Long id, ProductDto dto) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponse> delete(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<ApiResponse> find(Long id) {
        return null;
    }

}
