package com.e_commerce.Store.controller;

import com.e_commerce.Store.utils.CrudController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.e_commerce.Store.constants.ApiConstants.*;

@RestController
@RequestMapping(BASEURL)
public class ProductController implements CrudController {


    @Override
    @PostMapping(UPLOAD_PRODUCT)
    public ResponseEntity create() {
        return null;
    }

    @Override
    public ResponseEntity update() {
        return null;
    }

    @Override
    public ResponseEntity delete() {
        return null;
    }

    @Override
    public ResponseEntity find(Long id) {
        return null;
    }



//    @PostMapping(UPLOAD_PRODUCT)
//    public
}
