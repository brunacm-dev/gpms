package com.carona.controllers;

import com.carona.models.Usuario;
import com.carona.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("home")
    public String home(Model model) {
        Usuario usuario = usuarioService.carregarUsuario("antoniovinicius1801@gmail.com");
        model.addAttribute("username", usuario.getNome());
        return "home";
    }

    @GetMapping("novo-cadastro")
    public String cadastro() {
        return "novo-cadastro";
    }

}
