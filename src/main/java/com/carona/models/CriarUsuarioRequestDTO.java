package com.carona.models;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class CriarUsuarioRequestDTO {
	
	@NotNull(message = "campo nao pode estar vazio")
    private String nome;
	
	@NotNull(message = "campo nao pode estar vazio")
    private String email;
	@Pattern(regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$", message = "A senha deve ter pelo menos 8 caracteres e incluir uma letra minúscula, uma letra maiúscula, um número e um caractere especial.")
	@NotNull(message = "campo nao pode estar vazio")
    private String senha;
	
	//@EnumFormat(message = "O campo deve ser preenchido com 'CARONEIRO' OU 'CARONA'.", enumClass = )
	@NotNull(message = "campo nao pode estar vazio")
    private String papel; // Motorista ou Passageiro
	
    @Valid()
    private Carro veiculos; // Lista de veículos do usuário
    
}
