package com.carona.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ListarCaronaRequestDTO {
    private Integer idPontoFixo;
    
    private String localPartida;
    private String localDestino;

    private int quantidadePassageiros;
    private String tipoEmbarque;
}
