package com.example.demo.Controllers;

import com.example.demo.model.Feedback;
import com.example.demo.model.FoodMenu;
import com.example.demo.repo.Feedback_repo;
import com.example.demo.repo.FoodMenu_repo;
import com.example.demo.service.FeedbackService;
import com.example.demo.service.FoodMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    public List<FoodMenu> getAllFoodMenu(){
        return foodMenuService.getAllFoodMenu();
    }

    public FoodMenu getFoodMenu(Integer id){
        return foodMenuService.getFoodMenu(id);
    }
}
