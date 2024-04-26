package com.carona.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class PerfilUsuarioResponseDTO {

    private String nome;
    private String email;
    private String papel; // Motorista ou Passageiro
    private Carro veiculos; // Lista de veículos do usuário
    private int reputacao; // Reputação do usuário
    
}
