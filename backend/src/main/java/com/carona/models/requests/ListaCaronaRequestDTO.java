
package com.carona.models.requests;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

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
