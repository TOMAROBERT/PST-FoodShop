package com.example.demo.service;


import com.example.demo.model.Client;
import com.example.demo.model.Destination;
import com.example.demo.model.Feedback;
import com.example.demo.repo.Feedback_repo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

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

    //creare

    public Feedback createFeedback(@RequestBody Feedback feedback){
        return  feedback_repo.save(feedback);
    }

    public Feedback uppFeedback(@PathVariable("id") Integer id , @RequestBody Feedback feedback){
        feedback.setFeedbackId(id);
        return feedback_repo.save(feedback);
    }

    //delete
    public void DeleteFeedback(@PathVariable("id") Integer id)
    {
        feedback_repo.deleteById(id);
    }
}
