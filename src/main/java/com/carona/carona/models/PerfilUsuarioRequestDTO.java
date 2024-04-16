package com.carona.carona.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter @Setter
public class SolicitacaoCriacaoPerfilUsuario {
    private String primeiroNome;
    private String sobrenome;
    private int idade;
    private boolean ehMotorista;
    private Veiculo veiculo;

}