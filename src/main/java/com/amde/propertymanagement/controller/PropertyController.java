package com.amde.propertymanagement.controller;

import com.amde.propertymanagement.dto.PropertyDto;
import com.amde.propertymanagement.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/properties")
public class PropertyController {
    @Autowired
    private PropertyService propertyService;
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello!";
    }

    @PostMapping("/save")
    public ResponseEntity<PropertyDto> saveProperties(@RequestBody PropertyDto propertyDto){

        propertyDto = propertyService.saveProperty(propertyDto);

        ResponseEntity<PropertyDto> responseEntity = new ResponseEntity<>(propertyDto, HttpStatus.CREATED);
        return  responseEntity;
    }
}
