package com.e_commerce.Store.controller;

import com.e_commerce.Store.model.dto.ProductDto;
import com.e_commerce.Store.model.entity.Products;
import com.e_commerce.Store.model.mapper.ProductMapper;
import com.e_commerce.Store.response.ApiResponse;
import com.e_commerce.Store.response.ResponseWithData;
import com.e_commerce.Store.response.ServerResponse;
import com.e_commerce.Store.service.ProductService;
import com.e_commerce.Store.utils.CrudController;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.Server;
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
    public ResponseEntity<ApiResponse> update(@PathVariable Long id,@Valid @RequestBody ProductDto dto) {
        productService.updateProduct(id,dto);
        return ServerResponse.Ok("Product Updated Successfully");
    }

    @Override
    public ResponseEntity<ApiResponse> delete(@PathVariable Long id) {
       productService.deleteProduct(id);
       return ServerResponse.Ok("Product Deleted Successfully");
    }

    @Override
    public ResponseEntity<ResponseWithData> find(@PathVariable Long id) {
        productService.getProduct(id);
        return ServerResponse.withData("Product fetch successfully",productService.getProduct(id));
    }

}
