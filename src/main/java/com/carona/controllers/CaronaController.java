package com.carona.controllers;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carona.models.PedirCaronaRequestDTO;

@Validated
@RestController
@RequestMapping("/caronas")
public class CaronaController {


    @GetMapping("/pedir")
    public String pedirCarona(
    	@RequestBody PedirCaronaRequestDTO pedirCaronaRequestDTO
    		
    ) {
    	return "Pedir carona";
    }
    	

    @PostMapping("/pedir")
    public String pedirCarona() {
        return "Pedir carona";
    }

    @PostMapping("/oferecer")
    public String oferecerCarona() {
        return "Oferecer carona";
    }

    @GetMapping("/listar")
    public String listarCaronas() {
        return "Listar caronas";
    }

   
}