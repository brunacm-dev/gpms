package com.carona.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.carona.models.Usuario;
import com.carona.models.requests.CriarUsuarioRequestDTO;
import com.carona.services.UsuarioService;

import lombok.extern.slf4j.Slf4j;

@Validated
@Slf4j
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	@PostMapping(value = "/criar/perfil")
	public String criarPerfil(

			@RequestBody CriarUsuarioRequestDTO criarUsuarioRequestDTO

	) {
		log.debug("criarPerfil() INICIO : criando usuario request={}", criarUsuarioRequestDTO);
		usuarioService.criarUsuario(criarUsuarioRequestDTO);
		log.debug("criarPerfil() FIM");

		return "Perfil criado com sucesso";
	}

	@PostMapping("/perfil/{email}")
	public Usuario verPerfil(@PathVariable(value="email") String email) {
		return usuarioService.carregarUsuario(email);
	}
	
	//
	// @PostMapping("/atualizar")
	// public String atualizar() {
	// return "Ver perfil";
	// }

}