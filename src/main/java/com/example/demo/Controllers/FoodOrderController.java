package com.example.demo.Controllers;

import com.example.demo.model.Destination;
import com.example.demo.model.FoodMenu;
import com.example.demo.model.FoodOrder;
import com.example.demo.service.FoodMenuService;
import com.example.demo.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/foodorders")
public class FoodOrderController {

    private FoodOrderService foodOrderService;

    @Autowired
    public FoodOrderController(FoodOrderService foodOrderService){
        this.foodOrderService=foodOrderService;
    }

    @GetMapping
    public List<FoodOrder> getAllFoodOrders(){
        return foodOrderService.getAllFoodOrders();
    }

    @GetMapping("/{id}")
    public FoodOrder getFoodOrder(@PathVariable("id") Integer id){
        return foodOrderService.getFoodOrder(id);
    }

    //create
    @PostMapping
    public FoodOrder createFoodorder(@RequestBody FoodOrder foodOrder){
        return foodOrderService.createFoodorder(foodOrder);
    }

    //delete
    @DeleteMapping("/{id}")
    public void DeleteFoodorder(@PathVariable("id") Integer id)
    {
        foodOrderService.DeleteFoodorder(id);
    }
}
