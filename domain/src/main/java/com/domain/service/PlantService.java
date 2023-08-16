package com.domain.service;

import com.domain.model.Plant;

import java.util.List;

public interface PlantService {
    Plant addPlant(String name, String description, int level);
    List<Plant> listPlants();
    Plant findById(int id);
    void deletePlant(int id);
    void updatePlant(int id, int level);
}
