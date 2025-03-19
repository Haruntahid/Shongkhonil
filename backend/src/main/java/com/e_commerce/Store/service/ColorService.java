package com.e_commerce.Store.service;

import com.e_commerce.Store.model.entity.Colors;
import org.springframework.stereotype.Service;

@Service
public interface ColorService {
    void createColor(Colors color);
    void deleteColor(Long id);
    void updateColor(Long id, Colors color);
    Colors find(Long id);
}
