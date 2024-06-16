package com.carona.models;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Usuario {
    private String nome;
    private String email;
    private String papel;
    private Carro veiculo;
}
