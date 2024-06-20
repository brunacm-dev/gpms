package com.carona.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PedirCaronaRequestDTO {
    private Integer idViagem;

    private Integer idPontoFixo;
    private String email;

    private String localPartida;
    private String localDestino;
}
