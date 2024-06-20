package com.carona.models.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OferecerCaronaRequestDTO {
    @NotNull(message = "campo nao pode estar vazio")
    private String email;

    @NotNull(message = "campo nao pode estar vazio")
    private String idVeiculo;

    private String localPartida;
    private String localDestino;
    
    @NotNull(message = "campo nao pode estar vazio")
    private String dataPartida;
    @NotNull(message = "campo nao pode estar vazio")
    private String horaPartida;

    @NotNull(message = "campo nao pode estar vazio")
    private Integer quantidadePassageiros;

    private Integer idPontoFixo;
}
