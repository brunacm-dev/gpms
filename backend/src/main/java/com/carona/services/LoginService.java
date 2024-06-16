package com.carona.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carona.logins.UsuarioLoginDTO;
import com.carona.repository.AutenticacaoRepository;

@Service
public class LoginService {

    @Autowired
    private AutenticacaoRepository autenticacaoRepository;

    public boolean autenticar(UsuarioLoginDTO usuario) {
    	UsuarioLoginDTO usuarioDB = autenticacaoRepository.findByEmail(usuario.getEmail());
        if (usuarioDB != null && usuarioDB.getSenha().equals(usuario.getSenha())) {
            return true;
        } else {
            return false;
        }
    }
}
