package com.example.estudymasterclass.controller;

import com.example.estudymasterclass.model.Cliente;
import com.example.estudymasterclass.service.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/salvar")
    public ResponseEntity<Cliente> saveCliente(@RequestBody Cliente cliente){
        return new ResponseEntity<>(clienteService.saveCliente(cliente), HttpStatus.CREATED);
    }
}
