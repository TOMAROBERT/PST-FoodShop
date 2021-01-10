package com.example.demo.service;

import java.util.List;
import java.util.ArrayList;
import com.example.demo.model.Client;
import com.example.demo.repo.Client_repo;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    private final Client_repo client_repo;

    public ClientService(Client_repo client_repo){
        this.client_repo=client_repo;
    }

    public List<Client> getAllClients(){
        List<Client> clients = new ArrayList<>();
        client_repo.findAll().forEach(z ->clients.add(z));
        return clients;
    }

    public Client getClient(Integer id){
        return client_repo.findById(id).get();
    }

}
