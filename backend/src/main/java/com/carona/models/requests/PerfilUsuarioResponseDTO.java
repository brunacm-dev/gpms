package com.carona.models.requests;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class PerfilUsuarioResponseDTO extends CriarUsuarioRequestDTO {


    private int reputacao; // Reputação do usuário
    
}
