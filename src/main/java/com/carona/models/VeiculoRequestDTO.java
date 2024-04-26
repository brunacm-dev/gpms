package com.carona.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter @Setter
public class VeiculoRequestDTO {
    private String modelo;
    private String placa;
    private String cor;
    private int ano;
}
