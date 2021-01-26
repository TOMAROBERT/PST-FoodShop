package com.example.demo.Controllers;

import com.example.demo.model.Feedback;
import com.example.demo.service.FeedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/feedbacks")
public class FeedbackController {

    private FeedbackService feedbackService;

    @Autowired
    public FeedbackController(FeedbackService feedbackService){
        this.feedbackService=feedbackService;
    }

    public List<Feedback> getAllFeedbacks(){
        return feedbackService.getAllFeedbacks();
    }

    public Feedback getFeedback(Integer id){
        return feedbackService.getFeedback(id);
    }
}
