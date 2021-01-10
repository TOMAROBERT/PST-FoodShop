package com.example.demo.Controllers;

import com.example.demo.model.Client;
import com.example.demo.repo.Client_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.ArrayList;
import java.util.List;

public class ClientController {

    private final Client_repo Client_repo;

    @Autowired
    public ClientController(Client_repo Client_repo){
        this.Client_repo=Client_repo;
    }

    @GetMapping
    public List<Client> getAllClients(){
        List<Client> clients = new ArrayList<>();
        Client_repo.findAll().forEach(n->clients.add(n));
        return clients;
    }

    @GetMapping("/{id}")
    public Client getAllClientsById(@PathVariable("id") Integer id){
        return this.Client_repo.findById(id).orElse(null);
    }

    // Client nou adaugat
    @PostMapping
    public Client newClient(@RequestBody Client client){
        return Client_repo.save(client);
    }

    // Client modificat in functie de ID
    @PutMapping("/{id}")
    public Client modifyClient(@PathVariable("id") Integer id,@RequestBody Client client){
        client.setUserID(id);
        return Client_repo.save(client);
    }


}
