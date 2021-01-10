package com.example.demo.Controllers;

import com.example.demo.model.Feedback;
import com.example.demo.model.FoodMenu;
import com.example.demo.repo.Feedback_repo;
import com.example.demo.repo.FoodMenu_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class FoodMenuController {

    private final FoodMenu_repo foodMenu_repo;

    @Autowired
    public FoodMenuController (FoodMenu_repo foodMenu_repo){
        this.foodMenu_repo=foodMenu_repo;
    }

    @GetMapping
    public List<FoodMenu> getAllFoodMenus(){
        List<FoodMenu> foodMenus = new ArrayList<>();
        foodMenu_repo.findAll().forEach(y-> foodMenus.add(y));
        return foodMenus;
    }

    @GetMapping("/{id}")
    public FoodMenu getAllFoodMenusById(@PathVariable("id") Integer id){
        return this.foodMenu_repo.findById(id).orElse(null);
    }


}
