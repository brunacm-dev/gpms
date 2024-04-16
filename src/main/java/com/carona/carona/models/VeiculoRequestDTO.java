package com.carona.carona.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;

@Getter @Setter
public class Veiculo {
    private String modelo;
    private String placa;
    private String cor;
    private int ano;
}
