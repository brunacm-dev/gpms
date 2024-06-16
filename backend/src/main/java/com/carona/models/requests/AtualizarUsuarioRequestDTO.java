package com.carona.models.requests;

import lombok.Getter;
import lombok.Setter;

import com.carona.logins.UsuarioLoginDTO;
import com.carona.models.Carro;

@Getter @Setter
public class AtualizarUsuarioRequestDTO extends UsuarioLoginDTO{

    private String nome;
    private String papel; // Motorista ou Passageiro
    private Carro veiculos; // Lista de veículos do usuário
    private int reputacao; // Reputação do usuário
    
}
