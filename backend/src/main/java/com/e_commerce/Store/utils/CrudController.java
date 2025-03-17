package com.e_commerce.Store.utils;

import org.springframework.http.ResponseEntity;

public interface CrudController<T> {
    public ResponseEntity<T> create();

    public ResponseEntity<T> update();

    public ResponseEntity<T> delete();

    public ResponseEntity<T> find(Long id);
}
