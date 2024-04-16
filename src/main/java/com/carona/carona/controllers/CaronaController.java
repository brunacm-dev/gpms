package com.carona.carona.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/caronas")
public class CaronaController {

    @GetMapping("/pedir")
    public String pedirCarona() {
        return "Pedir carona";
    }

    @GetMapping("/oferecer")
    public String oferecerCarona() {
        return "Oferecer carona";
    }

    @GetMapping("/listar")
    public String listarCaronas() {
        return "Listar caronas";
    }

    @GetMapping("/perfil")
    public String verPerfil() {
        return "Ver perfil";
    }
}