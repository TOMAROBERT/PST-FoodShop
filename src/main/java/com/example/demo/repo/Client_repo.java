package com.example.demo.repo;

import com.example.demo.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface Client_repo extends CrudRepository<Client,Integer> {
}
