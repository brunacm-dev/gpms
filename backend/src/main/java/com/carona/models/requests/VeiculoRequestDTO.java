package com.carona.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VeiculoRequestDTO {
    private String modelo;
    private String placa;
    private String cor;
    private int ano;
}
