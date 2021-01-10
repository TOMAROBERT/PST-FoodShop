package com.example.demo.Controllers;


import com.example.demo.model.Destination;
import com.example.demo.repo.Destination_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

public class DestinationController {
    private final Destination_repo destination_repo;

    @Autowired
    public DestinationController (Destination_repo destination_repo){
        this.destination_repo=destination_repo;
    }

    @GetMapping
    public List<Destination> getAllDestinations(){
        List<Destination> destinations = new ArrayList<>();
        destination_repo.findAll().forEach(y-> destinations.add(y));
        return destinations;
    }

    @GetMapping("/{id}")
    public Destination getAllDestinationsById(@PathVariable("id") Integer id){
        return this.destination_repo.findById(id).orElse(null);
    }

}
