package com.domain.port;

import com.domain.model.Plant;

import java.util.List;
import java.util.Optional;

public interface PlantRepo {

    Plant save(Plant plant);
    List<Plant> findAll();
    Plant findById(int id);
    void delete(Plant plant);
}
