package com.infrastructure.repository.impl;

import com.domain.model.Plant;
import com.domain.port.PlantRepo;
import com.infrastructure.repository.PlantEntityRepo;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PlantRepoImpl implements PlantRepo {

    private final PlantEntityRepo plantEntityRepo;

    public PlantRepoImpl(PlantEntityRepo plantEntityRepo) {
        this.plantEntityRepo = plantEntityRepo;
    }

    @Override
    public Plant save(Plant plant) {
        return null;
    }

    @Override
    public List<Plant> findAll() {
        return null;
    }

    @Override
    public Optional<Plant> findById(int id) {
        return Optional.empty();
    }

    @Override
    public void deleteById(int id) {

    }
}
