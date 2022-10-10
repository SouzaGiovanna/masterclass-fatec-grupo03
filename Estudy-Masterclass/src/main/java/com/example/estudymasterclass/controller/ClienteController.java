package com.example.estudymasterclass.controller;

import com.example.estudymasterclass.model.Cliente;
import com.example.estudymasterclass.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("clientes")
public class ClienteController {
    @Autowired
    private ICliente clienteService;

    @GetMapping
    public ResponseEntity<List<Cliente>> getAllClientes(){
        return new ResponseEntity<>(clienteService.getAll(), HttpStatus.OK);
    }
}
