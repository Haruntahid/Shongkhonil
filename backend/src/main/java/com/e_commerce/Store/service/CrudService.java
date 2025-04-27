package com.e_commerce.Store.service;

import com.e_commerce.Store.model.entity.Colors;
import org.springframework.stereotype.Service;

@Service
public interface CrudService<E,D> {
    void create(D dto);
    void delete(Long id);
    void update(Long id, D dto);
    E find(Long id);
}
