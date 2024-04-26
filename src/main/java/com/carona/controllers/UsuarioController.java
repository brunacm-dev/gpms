package com.carona.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {


    @PostMapping("/perfil")
    public String verPerfil() {
        return "Ver perfil";
    }
    
    @PostMapping("/atualizar")
    public String atualizar() {
        return "Ver perfil";
    }
}