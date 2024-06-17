package com.carona.models;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Usuario {
    private Integer idUsuario;
    private String nome;
    private String email;
    private String papel;
}
