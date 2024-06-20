package com.carona.models;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Viagem {
    private String idViagem;
    private String email;
    private String idVeiculo;
    private String localPartida;
    private String localDestino;
    private String dataPartida;
    private String horaPartida;
    private Integer quantidadePassageiros;
    private Integer idPontoFixo;
    private Integer idMotorista;
}
