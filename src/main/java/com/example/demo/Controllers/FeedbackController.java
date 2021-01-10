package com.example.demo.Controllers;

import com.example.demo.model.Destination;
import com.example.demo.model.Feedback;
import com.example.demo.repo.Destination_repo;
import com.example.demo.repo.Feedback_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class FeedbackController {

    private final Feedback_repo feedback_repo;

    @Autowired
    public FeedbackController (Feedback_repo feedback_repo){
        this.feedback_repo=feedback_repo;
    }

    @GetMapping
    public List<Feedback> getAllFeedbacks(){
        List<Feedback> feedbacks = new ArrayList<>();
        feedback_repo.findAll().forEach(y-> feedbacks.add(y));
        return feedbacks;
    }

    @GetMapping("/{id}")
    public Feedback getAllFeedbacksById(@PathVariable("id") Integer id){
        return this.feedback_repo.findById(id).orElse(null);
    }
}
