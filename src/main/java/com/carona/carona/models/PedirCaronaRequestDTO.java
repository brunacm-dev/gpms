package com.carona.carona.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter @Setter
public class PedirCaronaRequestDTO {
    private String localPartida;
    private String destino;
    private LocalDateTime dataHoraViagem;
    private int quantidadePassageiros;
    private boolean embarqueImediato;
    
}
