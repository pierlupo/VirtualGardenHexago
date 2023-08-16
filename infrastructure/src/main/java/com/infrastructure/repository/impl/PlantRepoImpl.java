package com.infrastructure.repository.impl;

import com.domain.model.Plant;
import com.domain.port.PlantRepo;
import com.infrastructure.entity.PlantEntity;
import com.infrastructure.exception.NotFoundException;
import com.infrastructure.repository.PlantEntityRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Repository
public class PlantRepoImpl implements PlantRepo {
    private final PlantEntityRepo plantEntityRepo;
    private final ModelMapper modelMapper;

    public PlantRepoImpl(PlantEntityRepo plantEntityRepo, ModelMapper modelMapper) {
        this.plantEntityRepo = plantEntityRepo;
        this.modelMapper = modelMapper;
    }

    @Override
    public Plant save(Plant plant) {
        PlantEntity plantEntity = modelMapper.map(plant, PlantEntity.class);
        return modelMapper.map(plantEntityRepo.save(plantEntity), Plant.class);
    }

    @Override
    public List<Plant> findAll() {
        return convertToListPlants((List<PlantEntity>) plantEntityRepo.findAll());
    }

    @Override
    public Plant findById(int id) {
        Optional<PlantEntity> optionalPlantEntity = plantEntityRepo.findById(id);
        if(optionalPlantEntity.isPresent()){
            return modelMapper.map(optionalPlantEntity.get(), Plant.class);
        }
        throw new NotFoundException();
    }

    @Override
    public void delete(Plant plant) {
        plantEntityRepo.delete(modelMapper.map(plant, PlantEntity.class));
    }

    @Override
    public void update(int id, int level) {
        PlantEntity plantEntity = plantEntityRepo.findById(id).get();
        plantEntity.setLevel(level);
        plantEntityRepo.save(plantEntity);
    }

    //Convertir une liste de PlantEntity en Liste de Plant
    private List<Plant> convertToListPlants(List<PlantEntity> plantEntities) {
        List<Plant> plants = new ArrayList<>();
        plantEntities.forEach(p -> plants.add(modelMapper.map(p, Plant.class)));
        return plants;
    }
}
