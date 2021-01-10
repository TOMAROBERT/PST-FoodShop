package com.example.demo.repo;

import com.example.demo.model.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface Feedback_repo extends CrudRepository<Feedback,Integer> {
}
