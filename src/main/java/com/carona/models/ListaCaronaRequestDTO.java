package com.carona.models;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.List;

@Getter @Setter
public class ListaCaronaRequestDTO {

    private String papelUsuario; // Motorista ou Passageiro
    private String trajeto;
    private String motorista;
    private String veiculo;
    private List<String> passageiros;
    private int avaliacao; // Número de estrelas, de 0 a 5
    private String comentarios;
    private boolean chatAberto;
    private boolean viagemCancelada;
    private boolean aceiteManual;
    
}
