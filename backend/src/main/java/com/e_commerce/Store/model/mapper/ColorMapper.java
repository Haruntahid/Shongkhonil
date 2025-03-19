package com.e_commerce.Store.model.mapper;

import com.e_commerce.Store.model.dto.ColorDto;
import com.e_commerce.Store.model.entity.Colors;
import org.springframework.stereotype.Component;



@Component
public class ColorMapper {
    public Colors map(ColorDto dto) {
        Colors entity = new Colors();
        entity.setColor(dto.getColor());
        entity.setColorCode(dto.getColorCode());
        return entity;
    }

}
