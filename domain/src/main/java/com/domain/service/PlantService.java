package com.domain.service;

import com.domain.model.Plant;

import java.util.List;
import java.util.Optional;

public interface PlantService {
    Plant addPlant(String name, String description);
    List<Plant> listPlants();
    Optional<Plant> findById(int id);
    void deletePlant(int id);
}
