package com.amde.propertymanagement.converter;

import com.amde.propertymanagement.dto.PropertyDto;
import com.amde.propertymanagement.entity.PropertyEntity;
import org.springframework.stereotype.Component;

@Component
public class PropertyConverter {
    public PropertyEntity ConvertDtoToEntity(PropertyDto propertyDto){

        PropertyEntity pe = new PropertyEntity();

        pe.setTitle(propertyDto.getTitle());
        pe.setDescription(propertyDto.getDescription());
        pe.setOwnerName(propertyDto.getOwnerName());
        pe.setOwnerEmail(propertyDto.getOwnerEmail());
        pe.setPrice(propertyDto.getPrice());
        pe.setAddress(propertyDto.getAddress());

        return  pe;
    }

    public PropertyDto ConvertEntityToDto(PropertyEntity propertyEntity){
        PropertyDto propertyDto = new PropertyDto();

        propertyDto.setId(propertyEntity.getId());
        propertyDto.setDescription(propertyEntity.getDescription());
        propertyDto.setOwnerName(propertyEntity.getOwnerName());
        propertyDto.setOwnerEmail(propertyEntity.getOwnerEmail());
        propertyDto.setPrice(propertyEntity.getPrice());
        propertyDto.setAddress(propertyEntity.getAddress());

        return  propertyDto;
    }
}
