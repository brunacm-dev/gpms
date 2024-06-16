package com.carona.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carona.models.Usuario;
import com.carona.models.requests.CriarUsuarioRequestDTO;
import com.carona.repository.UsuarioRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public void criarUsuario(CriarUsuarioRequestDTO usuario) {
    	
    	log.debug("criarUsuario() INICIO : criando usuario usuario={}",usuario);
    	
        if (usuarioRepository.emailExiste(usuario.getEmail())) {
            throw new RuntimeException("Email já cadastrado");
        }

        usuarioRepository.criarUsuario(usuario.getNome(), "0" ,usuario.getEmail(), usuario.getSenha(), usuario.getPapel(), usuario.getVeiculo().getMarca(), usuario.getVeiculo().getModelo(), usuario.getVeiculo().getCor(), usuario.getVeiculo().getPlaca(), usuario.getVeiculo().getCnh());
    }

    public Usuario carregarUsuario(String email){
        if (!usuarioRepository.emailExiste(email)) {
            throw new RuntimeException("Email não encontrado");
        }

        return usuarioRepository.carregarUsuario(email);
    }
}
