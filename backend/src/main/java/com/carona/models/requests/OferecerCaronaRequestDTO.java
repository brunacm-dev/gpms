package com.carona.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class OferecerCaronaRequestDTO {
    private String usuarioId;
    private String papel; // motorista ou passageiro
    private String status; // passada ou atual

}
