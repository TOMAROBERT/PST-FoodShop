package com.example.demo.service;


import com.example.demo.model.Feedback;
import com.example.demo.model.FoodOrder;
import com.example.demo.repo.FoodOrder_repo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.ArrayList;

@Service
public class FoodOrderService {

    private final FoodOrder_repo foodOrder_repo;
    public FoodOrderService(FoodOrder_repo foodOrder_repo){
        this.foodOrder_repo=foodOrder_repo;
    }

    public List<FoodOrder> getAllFoodOrders(){
        List<FoodOrder> foodOrders = new ArrayList<>();
        foodOrder_repo.findAll().forEach(z->foodOrders.add(z));
        return foodOrders;
    }

    public FoodOrder getFoodOrder(Integer id){
        return foodOrder_repo.findById(id).get();
    }

    //creare

    public FoodOrder createFoodorder(@RequestBody FoodOrder foodOrder){
        return  foodOrder_repo.save(foodOrder);
    }

    public FoodOrder uppFoodorder(@PathVariable("id") Integer id , @RequestBody FoodOrder foodOrder){
        foodOrder.setOrderId(id);
        return foodOrder_repo.save(foodOrder);
    }

    //delete
    public void DeleteFoodorder(@PathVariable("id") Integer id)
    {
        foodOrder_repo.deleteById(id);
    }

}


