package com.carona.carona.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter @Setter
public class CaronaRequest {
    private String localSaida;
    private String localChegada;
    private String dataViagem;
    private String horaViagem;
    private int numPassageiros;
    private boolean aceitaAutomatico;
    private String horaRetorno;

}
