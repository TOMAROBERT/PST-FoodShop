package com.example.demo.service;


import com.example.demo.model.Feedback;
import com.example.demo.repo.Feedback_repo;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;


@Service
public class FeedbackService {
    private final Feedback_repo feedback_repo;
    public FeedbackService(Feedback_repo feedback_repo){
        this.feedback_repo=feedback_repo;
    }

    public List<Feedback> getAllFeedbacks(){
        List<Feedback> feedbacks = new ArrayList<>();
        feedback_repo.findAll().forEach(z->feedbacks.add(z));
        return feedbacks;
    }

    public Feedback getFeedback(Integer id){
        return feedback_repo.findById(id).get();
    }
}
