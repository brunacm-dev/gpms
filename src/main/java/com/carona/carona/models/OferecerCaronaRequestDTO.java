package com.carona.carona.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter @Setter
public class CaronaListRequest {
    private String usuarioId;
    private String papel; // motorista ou passageiro
    private String status; // passada ou atual

}
