package com.carona.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

import com.carona.logins.UsuarioLoginDTO;

@Getter @Setter
public class AtualizarUsuarioRequestDTO extends UsuarioLoginDTO{

    private String nome;
    private String papel; // Motorista ou Passageiro
    private Carro veiculos; // Lista de veículos do usuário
    private int reputacao; // Reputação do usuário
    
}
