package com.example.demo.Controllers;

import com.example.demo.model.FoodMenu;
import com.example.demo.model.FoodOrder;
import com.example.demo.repo.FoodMenu_repo;
import com.example.demo.repo.FoodOrder_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class FoodOrderController {

    private final FoodOrder_repo foodOrder_repo;

    @Autowired
    public FoodOrderController (FoodOrder_repo foodOrder_repo){
        this.foodOrder_repo=foodOrder_repo;
    }

    @GetMapping
    public List<FoodOrder> getAllFoodOrders(){
        List<FoodOrder> foodOrders = new ArrayList<>();
        foodOrder_repo.findAll().forEach(y-> foodOrders.add(y));
        return foodOrders;
    }

    @GetMapping("/{id}")
    public FoodOrder getAllFoodOrdersById(@PathVariable("id") Integer id){
        return this.foodOrder_repo.findById(id).orElse(null);
    }

}
