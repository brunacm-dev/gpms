package com.carona.models;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Carro {
	
	
	@NotNull(message = "campo nao pode estar vazio")
    private String marca;
	
	@NotNull(message = "campo nao pode estar vazio")
    private String modelo;
	
	@NotNull(message = "campo nao pode estar vazio")
    private String cor;
	
	@NotNull(message = "campo nao pode estar vazio")
    private String placa;
	
	@NotNull(message = "campo nao pode estar vazio")
    private String cnh;

}
