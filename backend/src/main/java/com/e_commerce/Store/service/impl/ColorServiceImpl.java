package com.e_commerce.Store.service.impl;

import com.e_commerce.Store.exceptions.NotFoundException;
import com.e_commerce.Store.model.entity.Colors;
import com.e_commerce.Store.repository.ColorRepository;
import com.e_commerce.Store.service.ColorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class ColorServiceImpl implements ColorService {

    private final ColorRepository colorRepository;

    @Override
    public void createColor(Colors color) {
        colorRepository.save(color);
    }

    @Override
    public void deleteColor(Long id) {
       Colors color = find(id);
       colorRepository.delete(color);
    }

    @Override
    public void updateColor(Long id, Colors color) {
        Colors exColor = find(id);
        exColor.setColor(color.getColor());
        exColor.setColorCode(color.getColorCode());
        colorRepository.save(exColor);
    }

    @Override
    public Colors find(Long id) {
        Optional<Colors> color = colorRepository.findById(id);
        if (color.isEmpty()) {
            throw new NotFoundException("Color not found with id " + id);
        }
       return color.get();
    }
}
