package com.example.demo.Controllers;


import com.example.demo.model.Client;
import com.example.demo.model.Destination;
import com.example.demo.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/destinations")
public class DestinationController {
    private DestinationService destinationService;

    @Autowired
    public DestinationController(DestinationService destinationService){
        this.destinationService = destinationService;
    }

    //Lista intreaga
    @GetMapping
    public List<Destination> getAllDestionations()
    {
        return destinationService.gettAllDestinations();
    }

    //Element dupa id
    @GetMapping("/{id}")
    public Destination getDestinationbyId(@PathVariable("id") Integer id)
    {
        return destinationService.getDestination(id);
    }

    //create
    @PostMapping
    public Destination createDestination(@RequestBody Destination destination){
        return destinationService.createDestination(destination);
    }

    //delete
    @DeleteMapping("/{id}")
    public void DeleteDestination(@PathVariable("id") Integer id)
    {
        destinationService.DeleteDestination(id);
    }

}
