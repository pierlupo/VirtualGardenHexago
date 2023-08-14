package com.application.service;

import com.domain.model.Plant;
import com.domain.port.PlantRepo;
import com.domain.service.PlantService;

import java.util.List;

public class PlantServiceImpl implements PlantService {

    private final PlantRepo plantRepo;

    public PlantServiceImpl(PlantRepo plantRepo) {
        this.plantRepo = plantRepo;
    }

    @Override
    public Plant addPlant(String name, String description) {
        Plant plant = new Plant(name, description);
        return plantRepo.save(plant); }

    @Override
    public List<Plant> listPlants() {
        return plantRepo.findAll();    }

    @Override
    public Plant findById(int id) {
        return plantRepo.findById(id);
    }

    @Override
    public void deletePlant(int id) {
        try {
            Plant plant = findById(id);
            plantRepo.delete(plant);
        }catch (Exception ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }
}
