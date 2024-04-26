package com.carona.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter @Setter
public class PedirCaronaRequestDTO {
    private String localPartida;
    private String destino;
    private String dataHoraViagem;
    private int quantidadePassageiros;
    private boolean embarqueImediato;
    
}
