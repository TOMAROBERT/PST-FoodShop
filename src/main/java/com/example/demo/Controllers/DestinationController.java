package com.example.demo.Controllers;


import com.example.demo.model.Destination;
import com.example.demo.service.DestinationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/destinations")
public class DestinationController {
    private final DestinationService destinationService;

    @Autowired
    public DestinationController(DestinationService destinationService){
        this.destinationService = destinationService;
    }

    //Lista intreaga
    public List<Destination> getAllDestionations()
    {
        return destinationService.gettAllDestinations();
    }

    //Element dupa id
    public Destination getDestination(Integer id)
    {
        return destinationService.getDestination(id);
    }

}
