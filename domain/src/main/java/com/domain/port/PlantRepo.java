package com.domain.port;

import com.domain.model.Plant;

import java.util.List;

public interface PlantRepo {

    Plant save(Plant plant);
    List<Plant> findAll();
    Plant findById(int id);
    void delete(Plant plant);
    void update(int id, int level);
}
