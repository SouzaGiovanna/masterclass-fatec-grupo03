package com.example.estudymasterclass.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
    private int id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
}
