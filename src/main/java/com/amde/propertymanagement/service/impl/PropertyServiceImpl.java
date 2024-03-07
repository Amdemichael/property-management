package com.amde.propertymanagement.service.impl;

import com.amde.propertymanagement.converter.PropertyConverter;
import com.amde.propertymanagement.dto.PropertyDto;
import com.amde.propertymanagement.entity.PropertyEntity;
import com.amde.propertymanagement.repository.PropertyRepository;
import com.amde.propertymanagement.service.PropertyService;
import jakarta.persistence.Column;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PropertyServiceImpl implements PropertyService {
    @Autowired
    private PropertyRepository propertyRepository;
    @Autowired
    private PropertyConverter propertyConverter;
    @Override
    public PropertyDto saveProperty(PropertyDto propertyDto) {

        PropertyEntity pe = propertyConverter.ConvertDtoToEntity(propertyDto);

        pe = propertyRepository.save(pe);

        propertyDto = propertyConverter.ConvertEntityToDto(pe);

        return propertyDto;
    }
}

