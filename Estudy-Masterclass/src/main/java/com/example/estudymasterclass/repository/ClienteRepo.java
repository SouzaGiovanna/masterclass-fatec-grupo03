package com.example.estudymasterclass.repository;

import com.example.estudymasterclass.model.Cliente;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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

    public Optional<Cliente> saveCliente(Cliente novoCliente){
        List<Cliente> clientes = new ArrayList<>(getAll());
        ObjectWriter writer = mapper.writer(new DefaultPrettyPrinter());

        clientes.add(novoCliente);

        try{
            writer.writeValue(new File(linkFile), clientes);

            return Optional.of(novoCliente);
        }catch (Exception ex){
            System.out.println("Erro ao escrever no arquivo!");
        }

        return Optional.empty();
    }
}
