package com.example.demo.repo;

import com.example.demo.model.FoodMenu;
import org.springframework.data.repository.CrudRepository;

public interface FoodMenu_repo extends CrudRepository<FoodMenu,Integer> {
}
