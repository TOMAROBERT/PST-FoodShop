package com.example.demo.service;

import java.util.List;
import java.util.ArrayList;
import com.example.demo.model.Client;
import com.example.demo.repo.Client_repo;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


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

    //creare
    public Client createClient(@RequestBody Client client){
        return  client_repo.save(client);
    }

    //edit
    public Client uppClient(@PathVariable("id") Integer id , @RequestBody Client client){
        client.setUserId(id);
        return client_repo.save(client);
    }

    //delete
    public void DeleteClient(@PathVariable("id") Integer id)
    {
        client_repo.deleteById(id);
    }
}
