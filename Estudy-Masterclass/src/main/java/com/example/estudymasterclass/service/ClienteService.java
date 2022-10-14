package com.example.estudymasterclass.service;

import com.example.estudymasterclass.model.Cliente;
import com.example.estudymasterclass.repository.ClienteRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ClienteService implements ICliente{
    @Autowired
    private ClienteRepo repo;

    @Override
    public List<Cliente> getAll() {
        return repo.getAll();
    }

    @Override
    public Cliente saveCliente(Cliente cliente) {
        return repo.saveCliente(cliente).get();
    }
}
