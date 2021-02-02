package com.example.demo.service;


import com.example.demo.model.Client;
import com.example.demo.model.Feedback;
import com.example.demo.model.FoodMenu;
import com.example.demo.repo.FoodMenu_repo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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

    //creare

    public FoodMenu createFoodmenu(@RequestBody FoodMenu foodMenu){
        return  foodMenu_repo.save(foodMenu);
    }

    public FoodMenu uppFoodmenu(@PathVariable("id") Integer id , @RequestBody FoodMenu foodMenu){
        foodMenu.setFoodId(id);
        return foodMenu_repo.save(foodMenu);
    }

    //delete
    public void DeleteFoodmenu(@PathVariable("id") Integer id)
    {
        foodMenu_repo.deleteById(id);
    }

}
