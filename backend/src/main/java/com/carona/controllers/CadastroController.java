package com.carona.controllers;

import com.carona.models.Usuario;
import com.carona.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class CadastroController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @PostMapping("/novo-cadastro")
    public String handleCadastro(@ModelAttribute Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, email, senha) VALUES (?, ?, ?)";
        jdbcTemplate.update(sql,
                usuario.getNome(),
                usuario.getEmail(),
                usuario.getSenha());
        return "redirect:/cadastro-sucesso";
    }

    @GetMapping("/cadastro-sucesso")
    public String showSuccessPage() {
        return "cadastro-sucesso";
    }

}
