package com.example.estudymasterclass.repository;

import com.example.estudymasterclass.model.Cliente;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.Arrays;
import java.util.List;

@Repository
public class ClienteRepo {
    private final String linkFile = "src/main/resources/clientes.json";
    @Autowired
    private ObjectMapper mapper;

    public List<Cliente> getAll(){
        try {
            return Arrays.asList(mapper.readValue(new File(linkFile), Cliente[].class));
        }catch (Exception ex){
            System.out.println("Erro ao ler o arquivo!");
        }

        return null;
    }
}
