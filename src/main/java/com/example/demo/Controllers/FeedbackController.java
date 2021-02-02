package com.example.demo.Controllers;

import com.example.demo.model.Destination;
import com.example.demo.model.Feedback;
import com.example.demo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    private FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService){
        this.feedbackService=feedbackService;
    }

    @GetMapping
    public List<Feedback> getAllFeedbacks(){
        return feedbackService.getAllFeedbacks();
    }

    @GetMapping("/{id}")
    public Feedback getFeedback(@PathVariable("id") Integer id){
        return feedbackService.getFeedback(id);
    }

    //create
    @PostMapping
    public Feedback createFeedback(@RequestBody Feedback feedback){
        return feedbackService.createFeedback(feedback);
    }

    //delete
    @DeleteMapping("/{id}")
    public void DeleteFeedback(@PathVariable("id") Integer id)
    {
        feedbackService.DeleteFeedback(id);
    }
}
