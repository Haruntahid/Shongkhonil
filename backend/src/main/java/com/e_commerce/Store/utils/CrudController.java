package com.e_commerce.Store.utils;

import org.springframework.http.ResponseEntity;

public interface CrudController<T,D> {
    public ResponseEntity<T> create(D dto);

    public ResponseEntity<T> update(Long id, D dto);

    public ResponseEntity<T> delete(Long id);

    public ResponseEntity<T> find(Long id);
}
