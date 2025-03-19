package com.e_commerce.Store.controller;

import com.e_commerce.Store.model.dto.ColorDto;
import com.e_commerce.Store.model.mapper.ColorMapper;
import com.e_commerce.Store.response.ApiResponse;
import com.e_commerce.Store.response.ServerResponse;
import com.e_commerce.Store.service.ColorService;
import com.e_commerce.Store.utils.CrudController;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import static com.e_commerce.Store.constants.ApiConstants.*;

@RestController
@RequestMapping(BASEURL)
@RequiredArgsConstructor
public class ColorController implements CrudController<ApiResponse, ColorDto>{

    private final ColorService colorService;
    private final ColorMapper mapper;

    @Override
    @PostMapping(UPLOAD_COLOR)
    public ResponseEntity<ApiResponse> create(@RequestBody ColorDto dto) {
        colorService.createColor(mapper.map(dto));
        return ServerResponse.created("Created Color Successfully");
    }

    @Override
    @PatchMapping(GET_COLOR)
    public ResponseEntity<ApiResponse> update(@PathVariable Long id,@RequestBody ColorDto dto) {
        colorService.updateColor(id, mapper.map(dto));
        return ServerResponse.Ok("Updated Color Successfully");
    }

    @Override
    @DeleteMapping(GET_COLOR)
    public ResponseEntity<ApiResponse> delete(@PathVariable Long id) {
        colorService.deleteColor(id);
        return ServerResponse.Ok("Deleted Color Successfully");
    }

    @Override
    @GetMapping(GET_COLOR)
    public ResponseEntity<ApiResponse> find(@PathVariable Long id) {
        colorService.find(id);
        return ServerResponse.Ok("Successfully Fetch Color");
    }
}
