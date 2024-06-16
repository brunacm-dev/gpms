package com.carona.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PedirCaronaRequestDTO {
    private String localPartida;
    private String destino;
    private String dataHoraViagem;
    private int quantidadePassageiros;
    private boolean embarqueImediato;
    
}
