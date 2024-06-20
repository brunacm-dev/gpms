package com.carona.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carona.models.Viagem;
import com.carona.models.requests.OferecerCaronaRequestDTO;
import com.carona.models.requests.PedirCaronaRequestDTO;
import com.carona.models.requests.ListarCaronaRequestDTO;
import com.carona.services.CaronaService;

@Validated
@RestController
@RequestMapping("/caronas")
public class CaronaController {

    @Autowired
    private CaronaService caronaService;

    @PostMapping("/oferecer")
    public String oferecerCarona(@RequestBody OferecerCaronaRequestDTO oferecerCaronaRequestDTO) {
        caronaService.oferecerCarona(oferecerCaronaRequestDTO);
        return "Carona oferecida com sucesso";
    }

    @GetMapping("/listar")
    public List<Viagem> listarCarona(
    	@RequestBody ListarCaronaRequestDTO pedirCaronaRequestDTO
    ) {
        return caronaService.listarCarona(pedirCaronaRequestDTO);
    }

    @PostMapping("/pedir-carona")
    public String pedirCarona(
        @RequestBody PedirCaronaRequestDTO pedirCaronaRequestDTO
    ) {
        caronaService.pedirCarona(pedirCaronaRequestDTO);
        return "Carona solicitada com sucesso";
    }

    // TODO - LISTAR MINHAS CARONAS ATUAIS
    // TODO - LISTAR MINHAS CARONAS PASSADAS
    // TODO - EXCLUIR A VIAGEM
}