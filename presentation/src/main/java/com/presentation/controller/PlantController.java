package com.presentation.controller;

import com.domain.service.PlantService;
import org.modelmapper.ModelMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/plant")
@RestController
public class PlantController {

    private final PlantService plantService;
    private final ModelMapper modelMapper;

    public PlantController(PlantService plantService, ModelMapper modelMapper) {
        this.plantService = plantService;
        this.modelMapper = modelMapper;
    }
}
