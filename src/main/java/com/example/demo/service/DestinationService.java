package com.example.demo.service;

import com.example.demo.model.Destination;
import com.example.demo.repo.Destination_repo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class DestinationService {

    private final Destination_repo destination_repo;

    public DestinationService(Destination_repo destination_repo){
        this.destination_repo=destination_repo;
    }

    public List<Destination> gettAllDestinations(){
        List<Destination> destinations = new ArrayList<>();
        destination_repo.findAll().forEach(z ->destinations.add(z));
        return destinations;
    }

    public Destination getDestination(Integer id){
        return destination_repo.findById(id).get();
    }

}
