package com.carona.models.requests;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VeiculoRequestDTO {
    @NotNull(message = "campo nao pode estar vazio")
    private String email;

    @NotNull(message = "campo nao pode estar vazio")
    private String marca;

    @NotNull(message = "campo nao pode estar vazio")
    private String modelo;

    @NotNull(message = "campo nao pode estar vazio")
    private String placa;

    @NotNull(message = "campo nao pode estar vazio")
    private String cor;

    @NotNull(message = "campo nao pode estar vazio")
    private String cnh;
}
