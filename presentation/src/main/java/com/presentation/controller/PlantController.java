package com.presentation.controller;

import com.domain.service.PlantService;
import com.presentation.dto.PlantRequestDTO;
import com.presentation.dto.PlantResponseDTO;
import org.modelmapper.ModelMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequestMapping("/api/plants")
@CrossOrigin(origins = "*", allowedHeaders = "*", methods = {RequestMethod.GET, RequestMethod.POST})
@RestController
public class PlantController {

    private final PlantService plantService;
    private final ModelMapper modelMapper;

    public PlantController(PlantService plantService, ModelMapper modelMapper) {
        this.plantService = plantService;
        this.modelMapper = modelMapper;
    }

    @PostMapping("")
    public ResponseEntity<PlantResponseDTO> post(@RequestBody PlantRequestDTO plantRequestDTO) {
        return ResponseEntity.ok(modelMapper.map(plantService.addPlant(plantRequestDTO.getName(), plantRequestDTO.getDescription(), plantRequestDTO.getLevel()), PlantResponseDTO.class));
    }

    @GetMapping("")
    public ResponseEntity<List<PlantResponseDTO>> get() {
        return ResponseEntity.ok(
                plantService.listPlants().stream().map(p -> modelMapper.map(p, PlantResponseDTO.class)).collect(Collectors.toList())
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<PlantResponseDTO> getById(@PathVariable int id) {
        return ResponseEntity.ok(modelMapper.map(plantService.findById(id), PlantResponseDTO.class));
    }

    @PutMapping("/{id}/{level}")
    public ResponseEntity<PlantResponseDTO> put(@PathVariable int id, @PathVariable int level) {
        plantService.updatePlant(id, level);
        return  ResponseEntity.ok(
                modelMapper.map(plantService.findById(id), PlantResponseDTO.class)
        );
    }

}
