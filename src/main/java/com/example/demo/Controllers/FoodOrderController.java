package com.example.demo.Controllers;

import com.example.demo.model.FoodMenu;
import com.example.demo.model.FoodOrder;
import com.example.demo.service.FoodMenuService;
import com.example.demo.service.FoodOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/foodorders")
public class FoodOrderController {

    private FoodOrderService foodOrderService;

    @Autowired
    public FoodOrderController(FoodOrderService foodOrderService){
        this.foodOrderService=foodOrderService;
    }

    public List<FoodOrder> getAllFoodOrders(){
        return foodOrderService.getAllFoodOrders();
    }

    public FoodOrder getFoodOrder(Integer id){
        return foodOrderService.getFoodOrder(id);
    }

}
