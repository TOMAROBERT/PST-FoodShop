package com.example.demo.Controllers;

import com.example.demo.model.Destination;
import com.example.demo.model.Feedback;
import com.example.demo.model.FoodMenu;
import com.example.demo.repo.Feedback_repo;
import com.example.demo.repo.FoodMenu_repo;
import com.example.demo.service.FeedbackService;
import com.example.demo.service.FoodMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/foodmenus")
public class FoodMenuController {

    private FoodMenuService foodMenuService;

    @Autowired
    public FoodMenuController(FoodMenuService foodMenuService){
        this.foodMenuService=foodMenuService;
    }

    @GetMapping
    public List<FoodMenu> getAllFoodMenu(){
        return foodMenuService.getAllFoodMenu();
    }

    @GetMapping("/{id}")
    public FoodMenu getFoodMenu(@PathVariable("id") Integer id){
        return foodMenuService.getFoodMenu(id);
    }

    //create
    @PostMapping
    public FoodMenu createFoodmenu(@RequestBody FoodMenu foodMenu){
        return foodMenuService.createFoodmenu(foodMenu);
    }

    //delete
    @DeleteMapping("/{id}")
    public void DeleteFoodmenu(@PathVariable("id") Integer id)
    {
        foodMenuService.DeleteFoodmenu(id);
    }
}
