package com.infrastructure.repository;

import com.infrastructure.entity.PlantEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlantEntityRepo extends CrudRepository<PlantEntity, Integer> {
}
