package com.example.demo.service;


import com.example.demo.model.FoodMenu;
import com.example.demo.repo.FoodMenu_repo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FoodMenuService {

    private final FoodMenu_repo foodMenu_repo;
    public FoodMenuService(FoodMenu_repo foodMenu_repo){
        this.foodMenu_repo=foodMenu_repo;
    }

    public List<FoodMenu> getAllFoodMenu(){
        List<FoodMenu> foodMenus =new ArrayList<>();
        foodMenu_repo.findAll().forEach(z->foodMenus.add(z));
        return foodMenus;
    }

    public FoodMenu getFoodMenu(Integer id){
        return foodMenu_repo.findById(id).get();
    }

}
