package com.e_commerce.Store.controller;

import com.e_commerce.Store.model.dto.CategoryDto;
import com.e_commerce.Store.model.mapper.CategoryMapper;
import com.e_commerce.Store.response.ApiResponse;
import com.e_commerce.Store.response.ResponseWithData;
import com.e_commerce.Store.response.ServerResponse;
import com.e_commerce.Store.service.CategoryService;
import com.e_commerce.Store.utils.CrudController;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.e_commerce.Store.constants.ApiConstants.*;

@RestController
@RequestMapping(BASEURL)
@RequiredArgsConstructor
public class CategoryController implements CrudController<CategoryDto> {

    private final CategoryService categoryService;
    private final CategoryMapper mapper;

    @Override
    @PostMapping(UPLOAD_CATEGORY)
    public ResponseEntity<ApiResponse> create(@Valid @RequestBody CategoryDto dto) {
        categoryService.createCategory(mapper.map(dto));
        return ServerResponse.created("Category Created Successfully");
    }

    @Override
    @PutMapping(GET_CATEGORY)
    public ResponseEntity<ApiResponse> update(@PathVariable Long id,@Valid @RequestBody CategoryDto dto) {
        categoryService.updateCategory(id, mapper.map(dto));
        return ServerResponse.Ok("Category Updated Successfully");
    }

    @Override
    @DeleteMapping(GET_CATEGORY)
    public ResponseEntity<ApiResponse> delete(@PathVariable Long id) {
        categoryService.deleteCategory(id);
        return ServerResponse.Ok("Category Deleted Successfully");
    }

    @Override
    @GetMapping(GET_CATEGORY)
    public ResponseEntity<ResponseWithData> find(@PathVariable Long id) {
        categoryService.find(id);
        return ServerResponse.withData("Successfully Fetch Category", categoryService.find(id));
    }
}
