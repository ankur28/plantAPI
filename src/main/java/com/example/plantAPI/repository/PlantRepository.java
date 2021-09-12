package com.example.plantAPI.repository;
import com.example.plantAPI.entities.Plant;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlantRepository extends CrudRepository<Plant, Integer> {
        List<Plant> findByHasFruitTrue();
        List<Plant> findByHasFruitFalse();
        List<Plant> findByQuantityLessThan(Integer quantity);
        List<Plant> findByHasFruitTrueAndQuantityLessThan(Integer quantity);
        List<Plant> findByHasFruitFalseAndQuantityLessThan(Integer quantity);
}