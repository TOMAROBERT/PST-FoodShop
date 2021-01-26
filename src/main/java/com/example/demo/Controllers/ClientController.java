package com.example.demo.Controllers;

import com.example.demo.model.Client;
import com.example.demo.repo.Client_repo;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService){
        this.clientService=clientService;
    }

    @GetMapping
    public List<Client> getAllClients(){
        return clientService.getAllClients();
    }

    @GetMapping("/{id}")
    public Client getAllClientsbyId(@PathVariable("id") Integer id){
        return clientService.getClient(id);
    }

    //create

    @PostMapping
    public Client createClient(@RequestBody Client client){
        return clientService.createClient(client);
    }

    @PutMapping("/{id}")
    public Client uppClient(@PathVariable("id") Integer id , @RequestBody Client client){
        return  clientService.uppClient(id,client);
    }
}
