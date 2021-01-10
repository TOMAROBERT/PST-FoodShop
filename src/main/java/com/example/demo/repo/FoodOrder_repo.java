package com.example.demo.repo;

import com.example.demo.model.FoodOrder;
import org.springframework.data.repository.CrudRepository;

public interface FoodOrder_repo extends CrudRepository<FoodOrder,Integer> {
}
